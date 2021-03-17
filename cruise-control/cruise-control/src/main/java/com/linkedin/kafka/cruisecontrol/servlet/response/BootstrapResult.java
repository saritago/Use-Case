/*
 * Copyright 2018 LinkedIn Corp. Licensed under the BSD 2-Clause License (the "License"). See License in the project root for license information.
 */

package com.linkedin.kafka.cruisecontrol.servlet.response;

import com.linkedin.kafka.cruisecontrol.config.KafkaCruiseControlConfig;
import com.linkedin.kafka.cruisecontrol.servlet.CruiseControlEndPoint;
import com.linkedin.cruisecontrol.servlet.parameters.CruiseControlParameters;

import static com.linkedin.kafka.cruisecontrol.servlet.response.ResponseUtils.getBaseJSONString;


@JsonResponseClass
@JsonResponseExternalFields(ResponseUtils.class)
public class BootstrapResult extends AbstractCruiseControlResponse {

  public BootstrapResult(KafkaCruiseControlConfig config) {
    super(config);
  }

  @Override
  protected void discardIrrelevantAndCacheRelevant(CruiseControlParameters parameters) {
    // Cache relevant response.
    String message = String.format("Bootstrap started. Check status through the %s endpoint", CruiseControlEndPoint.STATE);
    _cachedResponse = parameters.json() ? getBaseJSONString(message) : message;
  }
}
