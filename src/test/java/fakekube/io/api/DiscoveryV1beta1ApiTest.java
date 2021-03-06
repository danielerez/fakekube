/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: unversioned
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fakekube.io.api;

import fakekube.io.model.IoK8sApiDiscoveryV1beta1EndpointSlice;
import fakekube.io.model.IoK8sApiDiscoveryV1beta1EndpointSliceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Status;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API tests for DiscoveryV1beta1Api 
 */
public class DiscoveryV1beta1ApiTest {


    private DiscoveryV1beta1Api api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost", DiscoveryV1beta1Api.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String namespace = null;
        IoK8sApiDiscoveryV1beta1EndpointSlice body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.createDiscoveryV1beta1NamespacedEndpointSlice(namespace, body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDiscoveryV1beta1CollectionNamespacedEndpointSliceTest() {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.deleteDiscoveryV1beta1CollectionNamespacedEndpointSlice(namespace, pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        //Response response = api.deleteDiscoveryV1beta1NamespacedEndpointSlice(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscoveryV1beta1APIResourcesTest() {
        //Response response = api.getDiscoveryV1beta1APIResources();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDiscoveryV1beta1EndpointSliceForAllNamespacesTest() {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.listDiscoveryV1beta1EndpointSliceForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.listDiscoveryV1beta1NamespacedEndpointSlice(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        //Response response = api.patchDiscoveryV1beta1NamespacedEndpointSlice(name, namespace, body, pretty, dryRun, fieldManager, force);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        //Response response = api.readDiscoveryV1beta1NamespacedEndpointSlice(name, namespace, pretty, exact, export);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String name = null;
        String namespace = null;
        IoK8sApiDiscoveryV1beta1EndpointSlice body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.replaceDiscoveryV1beta1NamespacedEndpointSlice(name, namespace, body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchDiscoveryV1beta1EndpointSliceListForAllNamespacesTest() {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchDiscoveryV1beta1EndpointSliceListForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchDiscoveryV1beta1NamespacedEndpointSliceTest() {
        String name = null;
        String namespace = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchDiscoveryV1beta1NamespacedEndpointSlice(name, namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchDiscoveryV1beta1NamespacedEndpointSliceListTest() {
        String namespace = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchDiscoveryV1beta1NamespacedEndpointSliceList(namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
