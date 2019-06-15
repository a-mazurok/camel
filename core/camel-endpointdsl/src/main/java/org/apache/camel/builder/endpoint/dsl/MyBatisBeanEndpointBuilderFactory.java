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
 * Performs a query, insert, update or delete in a relational database using
 * MyBatis.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MyBatisBeanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MyBatis Bean component.
     */
    public static interface MyBatisBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMyBatisBeanEndpointBuilder advanced() {
            return (AdvancedMyBatisBeanEndpointBuilder) this;
        }
        /**
         * Name of the bean with the MyBatis annotations. This can either by a
         * type alias or a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MyBatisBeanEndpointBuilder beanName(String beanName) {
            setProperty("beanName", beanName);
            return this;
        }
        /**
         * Name of the method on the bean that has the SQL query to be executed.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MyBatisBeanEndpointBuilder methodName(String methodName) {
            setProperty("methodName", methodName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MyBatis Bean component.
     */
    public static interface AdvancedMyBatisBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MyBatisBeanEndpointBuilder basic() {
            return (MyBatisBeanEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMyBatisBeanEndpointBuilder basicPropertyBinding(
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
        default AdvancedMyBatisBeanEndpointBuilder basicPropertyBinding(
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
        default AdvancedMyBatisBeanEndpointBuilder synchronous(
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
        default AdvancedMyBatisBeanEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.ibatis.session.ExecutorType</code> enum.
     */
    public static enum ExecutorType {
        SIMPLE, REUSE, BATCH;
    }
    /**
     * Performs a query, insert, update or delete in a relational database using
     * MyBatis. Creates a builder to build endpoints for the MyBatis Bean
     * component.
     */
    default MyBatisBeanEndpointBuilder myBatisBean(String path) {
        class MyBatisBeanEndpointBuilderImpl extends AbstractEndpointBuilder implements MyBatisBeanEndpointBuilder, AdvancedMyBatisBeanEndpointBuilder {
            public MyBatisBeanEndpointBuilderImpl(String path) {
                super("mybatis-bean", path);
            }
        }
        return new MyBatisBeanEndpointBuilderImpl(path);
    }
}