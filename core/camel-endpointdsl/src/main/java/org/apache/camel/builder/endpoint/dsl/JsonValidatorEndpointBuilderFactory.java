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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validates the payload of a message using NetworkNT JSON Schema library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JsonValidatorEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JSON Schema Validator component.
     */
    public static interface JsonValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJsonValidatorEndpointBuilder advanced() {
            return (AdvancedJsonValidatorEndpointBuilder) this;
        }
        /**
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder resourceUri(String resourceUri) {
            setProperty("resourceUri", resourceUri);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder contentCache(boolean contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder contentCache(String contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Whether to fail if no body exists.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder failOnNullBody(
                boolean failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no body exists.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder failOnNullBody(
                String failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder failOnNullHeader(
                boolean failOnNullHeader) {
            setProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder failOnNullHeader(
                String failOnNullHeader) {
            setProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * To validate against a header instead of the message body.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default JsonValidatorEndpointBuilder headerName(String headerName) {
            setProperty("headerName", headerName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JSON Schema Validator component.
     */
    public static interface AdvancedJsonValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JsonValidatorEndpointBuilder basic() {
            return (JsonValidatorEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder basicPropertyBinding(
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
        default AdvancedJsonValidatorEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom ValidatorErrorHandler. The default error handler
         * captures the errors and throws an exception.
         * The option is a
         * <code>org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder errorHandler(
                Object errorHandler) {
            setProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom ValidatorErrorHandler. The default error handler
         * captures the errors and throws an exception.
         * The option will be converted to a
         * <code>org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder errorHandler(
                String errorHandler) {
            setProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom schema loader allowing for adding custom format
         * validation. The default implementation will create a schema loader
         * with draft v4 support.
         * The option is a
         * <code>org.apache.camel.component.jsonvalidator.JsonSchemaLoader</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder schemaLoader(
                Object schemaLoader) {
            setProperty("schemaLoader", schemaLoader);
            return this;
        }
        /**
         * To use a custom schema loader allowing for adding custom format
         * validation. The default implementation will create a schema loader
         * with draft v4 support.
         * The option will be converted to a
         * <code>org.apache.camel.component.jsonvalidator.JsonSchemaLoader</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder schemaLoader(
                String schemaLoader) {
            setProperty("schemaLoader", schemaLoader);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJsonValidatorEndpointBuilder synchronous(
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
        default AdvancedJsonValidatorEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Validates the payload of a message using NetworkNT JSON Schema library.
     * Creates a builder to build endpoints for the JSON Schema Validator
     * component.
     */
    default JsonValidatorEndpointBuilder jsonValidator(String path) {
        class JsonValidatorEndpointBuilderImpl extends AbstractEndpointBuilder implements JsonValidatorEndpointBuilder, AdvancedJsonValidatorEndpointBuilder {
            public JsonValidatorEndpointBuilderImpl(String path) {
                super("json-validator", path);
            }
        }
        return new JsonValidatorEndpointBuilderImpl(path);
    }
}