/*
 * Copyright 2018 BotsCrew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.botscrew.nlpclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Describes properties used by nlp module
 */
@Getter
@Setter
@ConfigurationProperties("nlp.provider")
public class NlpClientProperties {
    public static final String DIALOG_FLOW_V1 = "DIALOG_FLOW_V1";
    public static final String DIALOG_FLOW_V2 = "DIALOG_FLOW_V2";

    private String type = DIALOG_FLOW_V2;
}