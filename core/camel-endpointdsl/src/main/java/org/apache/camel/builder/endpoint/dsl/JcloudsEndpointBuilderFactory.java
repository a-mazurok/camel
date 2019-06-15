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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * For interacting with cloud compute & blobstore service via jclouds.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JcloudsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JClouds component.
     */
    public interface JcloudsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJcloudsEndpointConsumerBuilder advanced() {
            return (AdvancedJcloudsEndpointConsumerBuilder) this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option is a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointConsumerBuilder command(JcloudsCommand command) {
            setProperty("command", command);
            return this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option will be converted to a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointConsumerBuilder command(String command) {
            setProperty("command", command);
            return this;
        }
        /**
         * The name of the cloud provider that provides the target service (e.g.
         * aws-s3 or aws_ec2).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JcloudsEndpointConsumerBuilder providerId(String providerId) {
            setProperty("providerId", providerId);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default JcloudsEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default JcloudsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The name of the blob container.
         * The option is a <code>java.lang.String</code> type.
         * @group blobstore
         */
        default JcloudsEndpointConsumerBuilder container(String container) {
            setProperty("container", container);
            return this;
        }
        /**
         * An optional directory name to use.
         * The option is a <code>java.lang.String</code> type.
         * @group blobstore
         */
        default JcloudsEndpointConsumerBuilder directory(String directory) {
            setProperty("directory", directory);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JClouds component.
     */
    public interface AdvancedJcloudsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JcloudsEndpointConsumerBuilder basic() {
            return (JcloudsEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedJcloudsEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJcloudsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJcloudsEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedJcloudsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJcloudsEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointConsumerBuilder synchronous(
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
        default AdvancedJcloudsEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JClouds component.
     */
    public static interface JcloudsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJcloudsEndpointProducerBuilder advanced() {
            return (AdvancedJcloudsEndpointProducerBuilder) this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option is a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointProducerBuilder command(JcloudsCommand command) {
            setProperty("command", command);
            return this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option will be converted to a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointProducerBuilder command(String command) {
            setProperty("command", command);
            return this;
        }
        /**
         * The name of the cloud provider that provides the target service (e.g.
         * aws-s3 or aws_ec2).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JcloudsEndpointProducerBuilder providerId(String providerId) {
            setProperty("providerId", providerId);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default JcloudsEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default JcloudsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The name of the blob.
         * The option is a <code>java.lang.String</code> type.
         * @group blobstore
         */
        default JcloudsEndpointProducerBuilder blobName(String blobName) {
            setProperty("blobName", blobName);
            return this;
        }
        /**
         * The name of the blob container.
         * The option is a <code>java.lang.String</code> type.
         * @group blobstore
         */
        default JcloudsEndpointProducerBuilder container(String container) {
            setProperty("container", container);
            return this;
        }
        /**
         * The group that will be assigned to the newly created node. Values
         * depend on the actual cloud provider.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder group(String group) {
            setProperty("group", group);
            return this;
        }
        /**
         * The hardware that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder hardwareId(String hardwareId) {
            setProperty("hardwareId", hardwareId);
            return this;
        }
        /**
         * The imageId that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder imageId(String imageId) {
            setProperty("imageId", imageId);
            return this;
        }
        /**
         * The location that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder locationId(String locationId) {
            setProperty("locationId", locationId);
            return this;
        }
        /**
         * The id of the node that will run the script or destroyed.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder nodeId(String nodeId) {
            setProperty("nodeId", nodeId);
            return this;
        }
        /**
         * To filter by node status to only select running nodes etc.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder nodeState(String nodeState) {
            setProperty("nodeState", nodeState);
            return this;
        }
        /**
         * Specifies the type of operation that will be performed to the
         * blobstore.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The user on the target node that will run the script.
         * The option is a <code>java.lang.String</code> type.
         * @group compute
         */
        default JcloudsEndpointProducerBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JClouds component.
     */
    public interface AdvancedJcloudsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default JcloudsEndpointProducerBuilder basic() {
            return (JcloudsEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJcloudsEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointProducerBuilder synchronous(
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
        default AdvancedJcloudsEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JClouds component.
     */
    public static interface JcloudsEndpointBuilder
            extends
                JcloudsEndpointConsumerBuilder, JcloudsEndpointProducerBuilder {
        default AdvancedJcloudsEndpointBuilder advanced() {
            return (AdvancedJcloudsEndpointBuilder) this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option is a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointBuilder command(JcloudsCommand command) {
            setProperty("command", command);
            return this;
        }
        /**
         * What command to execute such as blobstore or compute.
         * The option will be converted to a
         * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> type.
         * @group common
         */
        default JcloudsEndpointBuilder command(String command) {
            setProperty("command", command);
            return this;
        }
        /**
         * The name of the cloud provider that provides the target service (e.g.
         * aws-s3 or aws_ec2).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default JcloudsEndpointBuilder providerId(String providerId) {
            setProperty("providerId", providerId);
            return this;
        }
        /**
         * The name of the blob container.
         * The option is a <code>java.lang.String</code> type.
         * @group blobstore
         */
        default JcloudsEndpointBuilder container(String container) {
            setProperty("container", container);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JClouds component.
     */
    public static interface AdvancedJcloudsEndpointBuilder
            extends
                AdvancedJcloudsEndpointConsumerBuilder, AdvancedJcloudsEndpointProducerBuilder {
        default JcloudsEndpointBuilder basic() {
            return (JcloudsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJcloudsEndpointBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointBuilder basicPropertyBinding(
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
        default AdvancedJcloudsEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedJcloudsEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jclouds.JcloudsCommand</code> enum.
     */
    public static enum JcloudsCommand {
        blobstore, compute;
    }
    /**
     * For interacting with cloud compute & blobstore service via jclouds.
     * Creates a builder to build endpoints for the JClouds component.
     */
    default JcloudsEndpointBuilder jclouds(String path) {
        class JcloudsEndpointBuilderImpl extends AbstractEndpointBuilder implements JcloudsEndpointBuilder, AdvancedJcloudsEndpointBuilder {
            public JcloudsEndpointBuilderImpl(String path) {
                super("jclouds", path);
            }
        }
        return new JcloudsEndpointBuilderImpl(path);
    }
}