package fakekube.io.api.impl;

import fakekube.io.api.*;
import fakekube.io.model.IoK8sApiEventsV1beta1Event;
import fakekube.io.model.IoK8sApiEventsV1beta1EventList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Status;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class EventsV1beta1ApiServiceImpl implements EventsV1beta1Api {
    public Response createEventsV1beta1NamespacedEvent(String namespace, IoK8sApiEventsV1beta1Event body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteEventsV1beta1CollectionNamespacedEvent(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteEventsV1beta1NamespacedEvent(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response getEventsV1beta1APIResources() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listEventsV1beta1EventForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listEventsV1beta1NamespacedEvent(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchEventsV1beta1NamespacedEvent(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readEventsV1beta1NamespacedEvent(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceEventsV1beta1NamespacedEvent(String name, String namespace, IoK8sApiEventsV1beta1Event body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchEventsV1beta1EventListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchEventsV1beta1NamespacedEvent(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchEventsV1beta1NamespacedEventList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}
