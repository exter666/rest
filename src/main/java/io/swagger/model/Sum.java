package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 
 **/

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

public class Sum   {
  private String sumName = null;

  private Double sumMonth = null;

  private Double sumYear = null;

  public Sum sumName(String sumName) {
    this.sumName = sumName;
    return this;
  }

   /**
   * Наименование суммы
   * @return sumName
  **/
  @ApiModelProperty(required = true, value = "Наименование суммы")
  public String getSumName() {
    return sumName;
  }

  public void setSumName(String sumName) {
    this.sumName = sumName;
  }

  public Sum sumMonth(Double sumMonth) {
    this.sumMonth = sumMonth;
    return this;
  }

   /**
   * Сумма за текущий месяц
   * @return sumMonth
  **/
  @ApiModelProperty(required = true, value = "Сумма за текущий месяц")
  public Double getSumMonth() {
    return sumMonth;
  }

  public void setSumMonth(Double sumMonth) {
    this.sumMonth = sumMonth;
  }

  public Sum sumYear(Double sumYear) {
    this.sumYear = sumYear;
    return this;
  }

   /**
   * Сумма с начала года
   * @return sumYear
  **/
  @ApiModelProperty(required = true, value = "Сумма с начала года")
  public Double getSumYear() {
    return sumYear;
  }

  public void setSumYear(Double sumYear) {
    this.sumYear = sumYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sum sum = (Sum) o;
    return Objects.equals(this.sumName, sum.sumName) &&
        Objects.equals(this.sumMonth, sum.sumMonth) &&
        Objects.equals(this.sumYear, sum.sumYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumName, sumMonth, sumYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sum {\n");
    
    sb.append("    sumName: ").append(toIndentedString(sumName)).append("\n");
    sb.append("    sumMonth: ").append(toIndentedString(sumMonth)).append("\n");
    sb.append("    sumYear: ").append(toIndentedString(sumYear)).append("\n");
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

