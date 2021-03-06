/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gobblin.service;

import gobblin.service.modules.flow.IdentityFlowToJobSpecCompiler;


public class ServiceConfigKeys {

  private static final String GOBBLIN_SERVICE_PREFIX = "gobblin.service.";

  // Gobblin Service Manager Keys
  public static final String GOBBLIN_SERVICE_TOPOLOGY_CATALOG_ENABLED_KEY = GOBBLIN_SERVICE_PREFIX + "topologyCatalog.enabled";
  public static final String GOBBLIN_SERVICE_FLOW_CATALOG_ENABLED_KEY = GOBBLIN_SERVICE_PREFIX + "flowCatalog.enabled";
  public static final String GOBBLIN_SERVICE_ORCHESTRATOR_ENABLED_KEY = GOBBLIN_SERVICE_PREFIX + "orchestrator.enabled";
  public static final String GOBBLIN_SERVICE_RESTLI_SERVER_ENABLED_KEY = GOBBLIN_SERVICE_PREFIX + "restliServer.enabled";

  // Flow Compiler Keys
  public static final String GOBBLIN_SERVICE_FLOWCOMPILER_CLASS_KEY = GOBBLIN_SERVICE_PREFIX + "flowCompiler.class";
  public static final String DEFAULT_GOBBLIN_SERVICE_FLOWCOMPILER_CLASS = IdentityFlowToJobSpecCompiler.class.getCanonicalName();

  // Flow specific keys
  public static final String FLOW_SOURCE_IDENTIFIER_KEY = "gobblin.flow.sourceIdentifier";
  public static final String FLOW_DESTINATION_IDENTIFIER_KEY = "gobblin.flow.destinationIdentifier";

  // Command line options
  public static final String SERVICE_NAME_OPTION_NAME = "service_name";

}
