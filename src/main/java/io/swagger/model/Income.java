package io.swagger.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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

@Entity
public class Income {
	@Id
	@Column
	private String id = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column
	@NotNull	
	private String month = null;

	@Column
	@NotNull	
	private String shortName = null;

	@Column
	@NotNull	
	private String fullName = null;

	@Column
	@NotNull	
	private String code = null;

	@Column
	@NotNull	
	private Double sum = null;

	@Column	
	private Double hours = null;

	@Column	
	private Double days = null;

	@Column	
	private Double percent = null;

	public Income month(String month) {
		this.month = month;
		return this;
	}

	/**
	 * Мес/кв
	 * 
	 * @return month
	 **/
	@ApiModelProperty(required = true, value = "Мес/кв")
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Income shortName(String shortName) {
		this.shortName = shortName;
		return this;
	}

	/**
	 * Вид оплат, краткое наименование (для ФТУ-69)
	 * 
	 * @return shortName
	 **/
	@ApiModelProperty(required = true, value = "Вид оплат, краткое наименование (для ФТУ-69)")
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Income fullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	/**
	 * Вид оплат, полное наименование (для визуализации на Портале)
	 * 
	 * @return fullName
	 **/
	@ApiModelProperty(required = true, value = "Вид оплат, полное наименование (для визуализации на Портале)")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Income code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Код
	 * 
	 * @return code
	 **/
	@ApiModelProperty(required = true, value = "Код")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Income sum(Double sum) {
		this.sum = sum;
		return this;
	}

	/**
	 * Сумма
	 * 
	 * @return sum
	 **/
	@ApiModelProperty(required = true, value = "Сумма")
	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Income hours(Double hours) {
		this.hours = hours;
		return this;
	}

	/**
	 * Часы
	 * 
	 * @return hours
	 **/
	@ApiModelProperty(value = "Часы")
	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Income days(Double days) {
		this.days = days;
		return this;
	}

	/**
	 * Дни
	 * 
	 * @return days
	 **/
	@ApiModelProperty(value = "Дни")
	public Double getDays() {
		return days;
	}

	public void setDays(Double days) {
		this.days = days;
	}

	public Income percent(Double percent) {
		this.percent = percent;
		return this;
	}

	/**
	 * Процент
	 * 
	 * @return percent
	 **/
	@ApiModelProperty(value = "Процент")
	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Income income = (Income) o;
		return Objects.equals(this.month, income.month) && Objects.equals(this.shortName, income.shortName)
				&& Objects.equals(this.fullName, income.fullName) && Objects.equals(this.code, income.code)
				&& Objects.equals(this.sum, income.sum) && Objects.equals(this.hours, income.hours)
				&& Objects.equals(this.days, income.days) && Objects.equals(this.percent, income.percent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(month, shortName, fullName, code, sum, hours, days, percent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Income {\n");

		sb.append("    month: ").append(toIndentedString(month)).append("\n");
		sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
		sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
		sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
		sb.append("    days: ").append(toIndentedString(days)).append("\n");
		sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
