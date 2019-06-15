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
 * The jolt component allows you to process a JSON messages using an JOLT
 * specification (such as JSON-JSON transformation).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JoltEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JOLT component.
     */
    public static interface JoltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJoltEndpointBuilder advanced() {
            return (AdvancedJoltEndpointBuilder) this;
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
        default JoltEndpointBuilder resourceUri(String resourceUri) {
            setProperty("resourceUri", resourceUri);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JoltEndpointBuilder contentCache(boolean contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JoltEndpointBuilder contentCache(String contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String.
         * The option is a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * @group producer
         */
        default JoltEndpointBuilder inputType(JoltInputOutputType inputType) {
            setProperty("inputType", inputType);
            return this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String.
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * @group producer
         */
        default JoltEndpointBuilder inputType(String inputType) {
            setProperty("inputType", inputType);
            return this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String.
         * The option is a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * @group producer
         */
        default JoltEndpointBuilder outputType(JoltInputOutputType outputType) {
            setProperty("outputType", outputType);
            return this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String.
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         * @group producer
         */
        default JoltEndpointBuilder outputType(String outputType) {
            setProperty("outputType", outputType);
            return this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used.
         * The option is a
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         * @group producer
         */
        default JoltEndpointBuilder transformDsl(JoltTransformType transformDsl) {
            setProperty("transformDsl", transformDsl);
            return this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used.
         * The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         * @group producer
         */
        default JoltEndpointBuilder transformDsl(String transformDsl) {
            setProperty("transformDsl", transformDsl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JOLT component.
     */
    public static interface AdvancedJoltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JoltEndpointBuilder basic() {
            return (JoltEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJoltEndpointBuilder basicPropertyBinding(
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
        default AdvancedJoltEndpointBuilder basicPropertyBinding(
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
        default AdvancedJoltEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJoltEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltInputOutputType</code> enum.
     */
    public static enum JoltInputOutputType {
        Hydrated, JsonString;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltTransformType</code> enum.
     */
    public static enum JoltTransformType {
        Chainr, Shiftr, Defaultr, Removr, Sortr;
    }
    /**
     * The jolt component allows you to process a JSON messages using an JOLT
     * specification (such as JSON-JSON transformation). Creates a builder to
     * build endpoints for the JOLT component.
     */
    default JoltEndpointBuilder jolt(String path) {
        class JoltEndpointBuilderImpl extends AbstractEndpointBuilder implements JoltEndpointBuilder, AdvancedJoltEndpointBuilder {
            public JoltEndpointBuilderImpl(String path) {
                super("jolt", path);
            }
        }
        return new JoltEndpointBuilderImpl(path);
    }
}