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
 * The pgevent component allows for producing/consuming PostgreSQL events
 * related to the listen/notify commands.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PgEventEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the PostgresSQL Event component.
     */
    public interface PgEventEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPgEventEndpointConsumerBuilder advanced() {
            return (AdvancedPgEventEndpointConsumerBuilder) this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The database name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder database(String database) {
            setProperty("database", database);
            return this;
        }
        /**
         * The channel name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option is a <code>javax.sql.DataSource</code> type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder datasource(Object datasource) {
            setProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option will be converted to a <code>javax.sql.DataSource</code>
         * type.
         * @group common
         */
        default PgEventEndpointConsumerBuilder datasource(String datasource) {
            setProperty("datasource", datasource);
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
        default PgEventEndpointConsumerBuilder bridgeErrorHandler(
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
        default PgEventEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointConsumerBuilder pass(String pass) {
            setProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointConsumerBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the PostgresSQL Event
     * component.
     */
    public interface AdvancedPgEventEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default PgEventEndpointConsumerBuilder basic() {
            return (PgEventEndpointConsumerBuilder) this;
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
        default AdvancedPgEventEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedPgEventEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedPgEventEndpointConsumerBuilder exchangePattern(
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
        default AdvancedPgEventEndpointConsumerBuilder exchangePattern(
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
        default AdvancedPgEventEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointConsumerBuilder synchronous(
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
        default AdvancedPgEventEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the PostgresSQL Event component.
     */
    public static interface PgEventEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPgEventEndpointProducerBuilder advanced() {
            return (AdvancedPgEventEndpointProducerBuilder) this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointProducerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default PgEventEndpointProducerBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default PgEventEndpointProducerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The database name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointProducerBuilder database(String database) {
            setProperty("database", database);
            return this;
        }
        /**
         * The channel name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointProducerBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option is a <code>javax.sql.DataSource</code> type.
         * @group common
         */
        default PgEventEndpointProducerBuilder datasource(Object datasource) {
            setProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option will be converted to a <code>javax.sql.DataSource</code>
         * type.
         * @group common
         */
        default PgEventEndpointProducerBuilder datasource(String datasource) {
            setProperty("datasource", datasource);
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
        default PgEventEndpointProducerBuilder lazyStartProducer(
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
        default PgEventEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointProducerBuilder pass(String pass) {
            setProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointProducerBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the PostgresSQL Event
     * component.
     */
    public interface AdvancedPgEventEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default PgEventEndpointProducerBuilder basic() {
            return (PgEventEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPgEventEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointProducerBuilder synchronous(
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
        default AdvancedPgEventEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the PostgresSQL Event component.
     */
    public static interface PgEventEndpointBuilder
            extends
                PgEventEndpointConsumerBuilder, PgEventEndpointProducerBuilder {
        default AdvancedPgEventEndpointBuilder advanced() {
            return (AdvancedPgEventEndpointBuilder) this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        default PgEventEndpointBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * To connect using hostname and port to the database.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        default PgEventEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The database name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointBuilder database(String database) {
            setProperty("database", database);
            return this;
        }
        /**
         * The channel name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default PgEventEndpointBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option is a <code>javax.sql.DataSource</code> type.
         * @group common
         */
        default PgEventEndpointBuilder datasource(Object datasource) {
            setProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * The option will be converted to a <code>javax.sql.DataSource</code>
         * type.
         * @group common
         */
        default PgEventEndpointBuilder datasource(String datasource) {
            setProperty("datasource", datasource);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointBuilder pass(String pass) {
            setProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default PgEventEndpointBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PostgresSQL Event component.
     */
    public static interface AdvancedPgEventEndpointBuilder
            extends
                AdvancedPgEventEndpointConsumerBuilder, AdvancedPgEventEndpointProducerBuilder {
        default PgEventEndpointBuilder basic() {
            return (PgEventEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPgEventEndpointBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointBuilder basicPropertyBinding(
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
        default AdvancedPgEventEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPgEventEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The pgevent component allows for producing/consuming PostgreSQL events
     * related to the listen/notify commands. Creates a builder to build
     * endpoints for the PostgresSQL Event component.
     */
    default PgEventEndpointBuilder pgEvent(String path) {
        class PgEventEndpointBuilderImpl extends AbstractEndpointBuilder implements PgEventEndpointBuilder, AdvancedPgEventEndpointBuilder {
            public PgEventEndpointBuilderImpl(String path) {
                super("pgevent", path);
            }
        }
        return new PgEventEndpointBuilderImpl(path);
    }
}