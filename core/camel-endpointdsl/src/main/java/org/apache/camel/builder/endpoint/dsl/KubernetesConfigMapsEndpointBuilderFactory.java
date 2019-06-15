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
 * The Kubernetes Configmaps component provides a producer to execute kubernetes
 * configmap operations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesConfigMapsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Kubernetes ConfigMap component.
     */
    public static interface KubernetesConfigMapsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKubernetesConfigMapsEndpointBuilder advanced() {
            return (AdvancedKubernetesConfigMapsEndpointBuilder) this;
        }
        /**
         * Kubernetes Master url.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder masterUrl(String masterUrl) {
            setProperty("masterUrl", masterUrl);
            return this;
        }
        /**
         * The Kubernetes API Version to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder dnsDomain(String dnsDomain) {
            setProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * The option is a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesClient(
                Object kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * The option will be converted to a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesClient(
                String kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder portName(String portName) {
            setProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default KubernetesConfigMapsEndpointBuilder portProtocol(
                String portProtocol) {
            setProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder caCertData(String caCertData) {
            setProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder caCertFile(String caCertFile) {
            setProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientCertData(
                String clientCertData) {
            setProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientCertFile(
                String clientCertFile) {
            setProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyAlgo(
                String clientKeyAlgo) {
            setProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyData(
                String clientKeyData) {
            setProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyFile(
                String clientKeyFile) {
            setProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyPassphrase(
                String clientKeyPassphrase) {
            setProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder oauthToken(String oauthToken) {
            setProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder trustCerts(
                Boolean trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder trustCerts(String trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default KubernetesConfigMapsEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kubernetes ConfigMap component.
     */
    public static interface AdvancedKubernetesConfigMapsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KubernetesConfigMapsEndpointBuilder basic() {
            return (KubernetesConfigMapsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder basicPropertyBinding(
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
        default AdvancedKubernetesConfigMapsEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder connectionTimeout(
                Integer connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder synchronous(
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
        default AdvancedKubernetesConfigMapsEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The Kubernetes Configmaps component provides a producer to execute
     * kubernetes configmap operations. Creates a builder to build endpoints for
     * the Kubernetes ConfigMap component.
     */
    default KubernetesConfigMapsEndpointBuilder kubernetesConfigMaps(String path) {
        class KubernetesConfigMapsEndpointBuilderImpl extends AbstractEndpointBuilder implements KubernetesConfigMapsEndpointBuilder, AdvancedKubernetesConfigMapsEndpointBuilder {
            public KubernetesConfigMapsEndpointBuilderImpl(String path) {
                super("kubernetes-config-maps", path);
            }
        }
        return new KubernetesConfigMapsEndpointBuilderImpl(path);
    }
}