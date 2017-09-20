package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentList;




/**
 * PaymentListsInner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

public class PaymentListsInner   {
  private PaymentList paymentList = null;

  public PaymentListsInner paymentList(PaymentList paymentList) {
    this.paymentList = paymentList;
    return this;
  }

   /**
   * Get paymentList
   * @return paymentList
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentList getPaymentList() {
    return paymentList;
  }

  public void setPaymentList(PaymentList paymentList) {
    this.paymentList = paymentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentListsInner paymentListsInner = (PaymentListsInner) o;
    return Objects.equals(this.paymentList, paymentListsInner.paymentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentListsInner {\n");
    
    sb.append("    paymentList: ").append(toIndentedString(paymentList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

