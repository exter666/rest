package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IncomeNatural;




/**
 * IncomesNaturalInner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

public class IncomesNaturalInner   {
  private IncomeNatural incomeNatural = null;

  public IncomesNaturalInner incomeNatural(IncomeNatural incomeNatural) {
    this.incomeNatural = incomeNatural;
    return this;
  }

   /**
   * Get incomeNatural
   * @return incomeNatural
  **/
  @ApiModelProperty(required = true, value = "")
  public IncomeNatural getIncomeNatural() {
    return incomeNatural;
  }

  public void setIncomeNatural(IncomeNatural incomeNatural) {
    this.incomeNatural = incomeNatural;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomesNaturalInner incomesNaturalInner = (IncomesNaturalInner) o;
    return Objects.equals(this.incomeNatural, incomesNaturalInner.incomeNatural);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeNatural);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomesNaturalInner {\n");
    
    sb.append("    incomeNatural: ").append(toIndentedString(incomeNatural)).append("\n");
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

