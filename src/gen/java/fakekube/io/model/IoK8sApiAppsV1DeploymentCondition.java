package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * DeploymentCondition describes the state of a deployment at a certain point.
 **/
@ApiModel(description="DeploymentCondition describes the state of a deployment at a certain point.")
public class IoK8sApiAppsV1DeploymentCondition  {
  
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
 /**
   * Last time the condition transitioned from one status to another.
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "The last time this condition was updated.")
 /**
   * The last time this condition was updated.
  **/
  private String lastUpdateTime = null;

  @ApiModelProperty(value = "A human readable message indicating details about the transition.")
 /**
   * A human readable message indicating details about the transition.
  **/
  private String message = null;

  @ApiModelProperty(value = "The reason for the condition's last transition.")
 /**
   * The reason for the condition's last transition.
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")
 /**
   * Status of the condition, one of True, False, Unknown.
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "Type of deployment condition.")
 /**
   * Type of deployment condition.
  **/
  private String type = null;
 /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiAppsV1DeploymentCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * The last time this condition was updated.
   * @return lastUpdateTime
  **/
  @JsonProperty("lastUpdateTime")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public IoK8sApiAppsV1DeploymentCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

 /**
   * A human readable message indicating details about the transition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiAppsV1DeploymentCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * The reason for the condition&#39;s last transition.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiAppsV1DeploymentCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sApiAppsV1DeploymentCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Type of deployment condition.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAppsV1DeploymentCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DeploymentCondition {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
