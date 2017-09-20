package io.swagger.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accrued;
import io.swagger.model.Ndfl;
import io.swagger.model.Pf;
import io.swagger.model.Withheld;
import io.swagger.model.WorkPeriods;
import org.joda.time.LocalDate;

/**
 * 
 **/

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

@Entity
public class PaymentList {

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
	private Integer type = null;

	@Column
	@NotNull
	private String currencyCode = null;

	@Column
	@NotNull
	private String org = null;

	@Column
	@NotNull
	private String division = null;

	@Column
	@NotNull
	private String subdivision = null;

	@Column
	@NotNull
	private String monthYear = null;

	@Column
	@NotNull
	private String tableNumber = null;

	@Column
	@NotNull
	private LocalDate hireDate = null;

	@Column
	@NotNull
	private String lastName = null;

	@Column
	@NotNull
	private String firstName = null;

	@Column
	@NotNull
	private String position = null;

	@Column
	@NotNull
	private String category = null;

	@Column
	@NotNull
	private Double salary = null;

	@Column
	@NotNull
	private Double planTime = null;

	@Column
	@NotNull
	private Double normTime = null;
	
	@OneToOne
	@NotNull
	private Accrued accrued = null;

	@OneToOne
	@NotNull
	private Withheld withheld = null;

	@Column
	@NotNull
	private Ndfl ndfl = null;

	@Column
	private Pf pf = null;

	@Column
	@NotNull
	private WorkPeriods workPeriods = null;

	@Column
	@NotNull
	private String hash = null;

	@Column	
	private String midName = null;

	@Column
	@NotNull
	private String snils = null;

	@Column
	@NotNull
	private String inn = null;

	public PaymentList type(Integer type) {
		this.type = type;
		return this;
	}

	/**
	 * Тип расчётного листка
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "Тип расчётного листка")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public PaymentList currencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	/**
	 * Код валюты расчётного листка по ОКВ
	 * 
	 * @return currencyCode
	 **/
	@ApiModelProperty(required = true, value = "Код валюты расчётного листка по ОКВ")
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public PaymentList org(String org) {
		this.org = org;
		return this;
	}

	/**
	 * Организация
	 * 
	 * @return org
	 **/
	@ApiModelProperty(required = true, value = "Организация")
	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public PaymentList division(String division) {
		this.division = division;
		return this;
	}

	/**
	 * Структурное подразделение
	 * 
	 * @return division
	 **/
	@ApiModelProperty(required = true, value = "Структурное подразделение")
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public PaymentList subdivision(String subdivision) {
		this.subdivision = subdivision;
		return this;
	}

	/**
	 * Подразделение
	 * 
	 * @return subdivision
	 **/
	@ApiModelProperty(required = true, value = "Подразделение")
	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

	public PaymentList monthYear(String monthYear) {
		this.monthYear = monthYear;
		return this;
	}

	/**
	 * Расчётный месяц
	 * 
	 * @return monthYear
	 **/
	@ApiModelProperty(required = true, value = "Расчётный месяц")
	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public PaymentList tableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
		return this;
	}

	/**
	 * Табельный номер
	 * 
	 * @return tableNumber
	 **/
	@ApiModelProperty(required = true, value = "Табельный номер")
	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public PaymentList hireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
		return this;
	}

	/**
	 * Дата приёма
	 * 
	 * @return hireDate
	 **/
	@ApiModelProperty(required = true, value = "Дата приёма")
	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public PaymentList lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Фамилия
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(required = true, value = "Фамилия")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PaymentList firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Имя
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(required = true, value = "Имя")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public PaymentList position(String position) {
		this.position = position;
		return this;
	}

	/**
	 * Наименование должности/профессии
	 * 
	 * @return position
	 **/
	@ApiModelProperty(required = true, value = "Наименование должности/профессии")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public PaymentList category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Категория
	 * 
	 * @return category
	 **/
	@ApiModelProperty(required = true, value = "Категория")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public PaymentList salary(Double salary) {
		this.salary = salary;
		return this;
	}

	/**
	 * Оклад/тариф
	 * 
	 * @return salary
	 **/
	@ApiModelProperty(required = true, value = "Оклад/тариф")
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public PaymentList planTime(Double planTime) {
		this.planTime = planTime;
		return this;
	}

	/**
	 * Плановое время в часах
	 * 
	 * @return planTime
	 **/
	@ApiModelProperty(required = true, value = "Плановое время в часах")
	public Double getPlanTime() {
		return planTime;
	}

	public void setPlanTime(Double planTime) {
		this.planTime = planTime;
	}

	public PaymentList normTime(Double normTime) {
		this.normTime = normTime;
		return this;
	}

	/**
	 * Норма часов (по закону)
	 * 
	 * @return normTime
	 **/
	@ApiModelProperty(required = true, value = "Норма часов (по закону)")
	public Double getNormTime() {
		return normTime;
	}

	public void setNormTime(Double normTime) {
		this.normTime = normTime;
	}

	public PaymentList accrued(Accrued accrued) {
		this.accrued = accrued;
		return this;
	}

	/**
	 * Get accrued
	 * 
	 * @return accrued
	 **/
	@ApiModelProperty(required = true, value = "")
	public Accrued getAccrued() {
		return accrued;
	}

	public void setAccrued(Accrued accrued) {
		this.accrued = accrued;
	}

	public PaymentList withheld(Withheld withheld) {
		this.withheld = withheld;
		return this;
	}

	/**
	 * Get withheld
	 * 
	 * @return withheld
	 **/
	@ApiModelProperty(required = true, value = "")
	public Withheld getWithheld() {
		return withheld;
	}

	public void setWithheld(Withheld withheld) {
		this.withheld = withheld;
	}

	public PaymentList ndfl(Ndfl ndfl) {
		this.ndfl = ndfl;
		return this;
	}

	/**
	 * Get ndfl
	 * 
	 * @return ndfl
	 **/
	@ApiModelProperty(required = true, value = "")
	public Ndfl getNdfl() {
		return ndfl;
	}

	public void setNdfl(Ndfl ndfl) {
		this.ndfl = ndfl;
	}

	public PaymentList pf(Pf pf) {
		this.pf = pf;
		return this;
	}

	/**
	 * Get pf
	 * 
	 * @return pf
	 **/
	@ApiModelProperty(required = true, value = "")
	public Pf getPf() {
		return pf;
	}

	public void setPf(Pf pf) {
		this.pf = pf;
	}

	public PaymentList workPeriods(WorkPeriods workPeriods) {
		this.workPeriods = workPeriods;
		return this;
	}

	/**
	 * Get workPeriods
	 * 
	 * @return workPeriods
	 **/
	@ApiModelProperty(required = true, value = "")
	public WorkPeriods getWorkPeriods() {
		return workPeriods;
	}

	public void setWorkPeriods(WorkPeriods workPeriods) {
		this.workPeriods = workPeriods;
	}

	public PaymentList hash(String hash) {
		this.hash = hash;
		return this;
	}

	/**
	 * 
	 * @return hash
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public PaymentList midName(String midName) {
		this.midName = midName;
		return this;
	}

	/**
	 * Отчество
	 * 
	 * @return midName
	 **/
	@ApiModelProperty(value = "Отчество")
	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public PaymentList snils(String snils) {
		this.snils = snils;
		return this;
	}

	/**
	 * Справочно СНИЛС
	 * 
	 * @return snils
	 **/
	@ApiModelProperty(value = "Справочно СНИЛС")
	public String getSnils() {
		return snils;
	}

	public void setSnils(String snils) {
		this.snils = snils;
	}

	public PaymentList inn(String inn) {
		this.inn = inn;
		return this;
	}

	/**
	 * Справочно ИНН (для Казахстана)
	 * 
	 * @return inn
	 **/
	@ApiModelProperty(value = "Справочно ИНН (для Казахстана)")
	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentList paymentList = (PaymentList) o;
		return Objects.equals(this.type, paymentList.type)
				&& Objects.equals(this.currencyCode, paymentList.currencyCode)
				&& Objects.equals(this.org, paymentList.org) && Objects.equals(this.division, paymentList.division)
				&& Objects.equals(this.subdivision, paymentList.subdivision)
				&& Objects.equals(this.monthYear, paymentList.monthYear)
				&& Objects.equals(this.tableNumber, paymentList.tableNumber)
				&& Objects.equals(this.hireDate, paymentList.hireDate)
				&& Objects.equals(this.lastName, paymentList.lastName)
				&& Objects.equals(this.firstName, paymentList.firstName)
				&& Objects.equals(this.position, paymentList.position)
				&& Objects.equals(this.category, paymentList.category)
				&& Objects.equals(this.salary, paymentList.salary)
				&& Objects.equals(this.planTime, paymentList.planTime)
				&& Objects.equals(this.normTime, paymentList.normTime)
				&& Objects.equals(this.accrued, paymentList.accrued)
				&& Objects.equals(this.withheld, paymentList.withheld) && Objects.equals(this.ndfl, paymentList.ndfl)
				&& Objects.equals(this.pf, paymentList.pf) && Objects.equals(this.workPeriods, paymentList.workPeriods)
				&& Objects.equals(this.hash, paymentList.hash) && Objects.equals(this.midName, paymentList.midName)
				&& Objects.equals(this.snils, paymentList.snils) && Objects.equals(this.inn, paymentList.inn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, currencyCode, org, division, subdivision, monthYear, tableNumber, hireDate, lastName,
				firstName, position, category, salary, planTime, normTime, accrued, withheld, ndfl, pf, workPeriods,
				hash, midName, snils, inn);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentList {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
		sb.append("    org: ").append(toIndentedString(org)).append("\n");
		sb.append("    division: ").append(toIndentedString(division)).append("\n");
		sb.append("    subdivision: ").append(toIndentedString(subdivision)).append("\n");
		sb.append("    monthYear: ").append(toIndentedString(monthYear)).append("\n");
		sb.append("    tableNumber: ").append(toIndentedString(tableNumber)).append("\n");
		sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    position: ").append(toIndentedString(position)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
		sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
		sb.append("    normTime: ").append(toIndentedString(normTime)).append("\n");
		sb.append("    accrued: ").append(toIndentedString(accrued)).append("\n");
		sb.append("    withheld: ").append(toIndentedString(withheld)).append("\n");
		sb.append("    ndfl: ").append(toIndentedString(ndfl)).append("\n");
		sb.append("    pf: ").append(toIndentedString(pf)).append("\n");
		sb.append("    workPeriods: ").append(toIndentedString(workPeriods)).append("\n");
		sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
		sb.append("    midName: ").append(toIndentedString(midName)).append("\n");
		sb.append("    snils: ").append(toIndentedString(snils)).append("\n");
		sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
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
