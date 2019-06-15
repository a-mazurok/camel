/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The google-calendar component provides access to Google Calendar in a
 * streaming mode.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleCalendarStreamEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google Calendar Stream component.
     */
    public static interface GoogleCalendarStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoogleCalendarStreamEndpointBuilder advanced() {
            return (AdvancedGoogleCalendarStreamEndpointBuilder) this;
        }
        /**
         * Specifies an index for the endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder index(String index) {
            setProperty("index", index);
            return this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder accessToken(
                String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google Calendar application name. Example would be
         * camel-google-calendar/1.0.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder applicationName(
                String applicationName) {
            setProperty("applicationName", applicationName);
            return this;
        }
        /**
         * The calendarId to be used.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder calendarId(String calendarId) {
            setProperty("calendarId", calendarId);
            return this;
        }
        /**
         * Client ID of the calendar application.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder clientId(String clientId) {
            setProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the calendar application.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder clientSecret(
                String clientSecret) {
            setProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Take into account the lastUpdate of the last event polled as start
         * date for the next poll.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder considerLastUpdate(
                boolean considerLastUpdate) {
            setProperty("considerLastUpdate", considerLastUpdate);
            return this;
        }
        /**
         * Take into account the lastUpdate of the last event polled as start
         * date for the next poll.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder considerLastUpdate(
                String considerLastUpdate) {
            setProperty("considerLastUpdate", considerLastUpdate);
            return this;
        }
        /**
         * Consume events in the selected calendar from now on.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder consumeFromNow(
                boolean consumeFromNow) {
            setProperty("consumeFromNow", consumeFromNow);
            return this;
        }
        /**
         * Consume events in the selected calendar from now on.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder consumeFromNow(
                String consumeFromNow) {
            setProperty("consumeFromNow", consumeFromNow);
            return this;
        }
        /**
         * Max results to be returned.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder maxResults(int maxResults) {
            setProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Max results to be returned.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder maxResults(String maxResults) {
            setProperty("maxResults", maxResults);
            return this;
        }
        /**
         * The query to execute on calendar.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder query(String query) {
            setProperty("query", query);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder refreshToken(
                String refreshToken) {
            setProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. See
         * https://developers.google.com/calendar/auth for more info.
         * The option is a <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder scopes(List<String> scopes) {
            setProperty("scopes", scopes);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. See
         * https://developers.google.com/calendar/auth for more info.
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * @group consumer
         */
        default GoogleCalendarStreamEndpointBuilder scopes(String scopes) {
            setProperty("scopes", scopes);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Calendar Stream component.
     */
    public static interface AdvancedGoogleCalendarStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default GoogleCalendarStreamEndpointBuilder basic() {
            return (GoogleCalendarStreamEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoogleCalendarStreamEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoogleCalendarStreamEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoogleCalendarStreamEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoogleCalendarStreamEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The google-calendar component provides access to Google Calendar in a
     * streaming mode. Creates a builder to build endpoints for the Google
     * Calendar Stream component.
     */
    default GoogleCalendarStreamEndpointBuilder googleCalendarStream(String path) {
        class GoogleCalendarStreamEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleCalendarStreamEndpointBuilder, AdvancedGoogleCalendarStreamEndpointBuilder {
            public GoogleCalendarStreamEndpointBuilderImpl(String path) {
                super("google-calendar-stream", path);
            }
        }
        return new GoogleCalendarStreamEndpointBuilderImpl(path);
    }
}