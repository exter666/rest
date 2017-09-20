package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;



/**
 * 
 **/

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

public class Period   {
  private LocalDate beginDate = null;

  private LocalDate endDate = null;

  private String terrConds = null;

  private String specConds = null;

  private String calcExp = null;

  public Period beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Начало периода
   * @return beginDate
  **/
  @ApiModelProperty(required = true, value = "Начало периода")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public Period endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Конец периода
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Конец периода")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Period terrConds(String terrConds) {
    this.terrConds = terrConds;
    return this;
  }

   /**
   * Территориальные условия
   * @return terrConds
  **/
  @ApiModelProperty(value = "Территориальные условия")
  public String getTerrConds() {
    return terrConds;
  }

  public void setTerrConds(String terrConds) {
    this.terrConds = terrConds;
  }

  public Period specConds(String specConds) {
    this.specConds = specConds;
    return this;
  }

   /**
   * Особые условия труда
   * @return specConds
  **/
  @ApiModelProperty(value = "Особые условия труда")
  public String getSpecConds() {
    return specConds;
  }

  public void setSpecConds(String specConds) {
    this.specConds = specConds;
  }

  public Period calcExp(String calcExp) {
    this.calcExp = calcExp;
    return this;
  }

   /**
   * Исчисление трудового стажа
   * @return calcExp
  **/
  @ApiModelProperty(value = "Исчисление трудового стажа")
  public String getCalcExp() {
    return calcExp;
  }

  public void setCalcExp(String calcExp) {
    this.calcExp = calcExp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Period period = (Period) o;
    return Objects.equals(this.beginDate, period.beginDate) &&
        Objects.equals(this.endDate, period.endDate) &&
        Objects.equals(this.terrConds, period.terrConds) &&
        Objects.equals(this.specConds, period.specConds) &&
        Objects.equals(this.calcExp, period.calcExp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, endDate, terrConds, specConds, calcExp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Period {\n");
    
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    terrConds: ").append(toIndentedString(terrConds)).append("\n");
    sb.append("    specConds: ").append(toIndentedString(specConds)).append("\n");
    sb.append("    calcExp: ").append(toIndentedString(calcExp)).append("\n");
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

