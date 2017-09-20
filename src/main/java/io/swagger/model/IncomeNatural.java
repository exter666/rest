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

public class IncomeNatural   {
  private String month = null;

  private String shortName = null;

  private String fullName = null;

  private String code = null;

  private Double sum = null;

  public IncomeNatural month(String month) {
    this.month = month;
    return this;
  }

   /**
   * Мес
   * @return month
  **/
  @ApiModelProperty(required = true, value = "Мес")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public IncomeNatural shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Вид дохода, краткое наименование (для ФТУ-69)
   * @return shortName
  **/
  @ApiModelProperty(required = true, value = "Вид дохода, краткое наименование (для ФТУ-69)")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public IncomeNatural fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Вид дохода, полное наименование (для визуализации на Портале)
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "Вид дохода, полное наименование (для визуализации на Портале)")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public IncomeNatural code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Код
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Код")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IncomeNatural sum(Double sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Сумма
   * @return sum
  **/
  @ApiModelProperty(required = true, value = "Сумма")
  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeNatural incomeNatural = (IncomeNatural) o;
    return Objects.equals(this.month, incomeNatural.month) &&
        Objects.equals(this.shortName, incomeNatural.shortName) &&
        Objects.equals(this.fullName, incomeNatural.fullName) &&
        Objects.equals(this.code, incomeNatural.code) &&
        Objects.equals(this.sum, incomeNatural.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, shortName, fullName, code, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeNatural {\n");
    
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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

