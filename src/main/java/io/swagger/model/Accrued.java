package io.swagger.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Incomes;
import io.swagger.model.IncomesNatural;

/**
 * 
 **/

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

@Entity
public class Accrued {
	@Id	
	@Column
	private String id = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
				
	private Incomes incomes = null;

	@Column
	@NotNull
	private Double incomeSum = null;

	@Column
	@NotNull
	private Double hoursSum = null;

	@Column	
	private IncomesNatural incomesNatural = null;

	@Column
	@NotNull
	private Double incomeNaturalSum = null;

	public Accrued incomes(Incomes incomes) {
		this.incomes = incomes;
		return this;
	}

	/**
	 * Get incomes
	 * 
	 * @return incomes
	 **/
	@ApiModelProperty(required = true, value = "")
	public Incomes getIncomes() {
		return incomes;
	}

	public void setIncomes(Incomes incomes) {
		this.incomes = incomes;
	}

	public Accrued incomeSum(Double incomeSum) {
		this.incomeSum = incomeSum;
		return this;
	}

	/**
	 * Всего начислено
	 * 
	 * @return incomeSum
	 **/
	@ApiModelProperty(required = true, value = "Всего начислено")
	public Double getIncomeSum() {
		return incomeSum;
	}

	public void setIncomeSum(Double incomeSum) {
		this.incomeSum = incomeSum;
	}

	public Accrued hoursSum(Double hoursSum) {
		this.hoursSum = hoursSum;
		return this;
	}

	/**
	 * Всего отработано часов за месяц
	 * 
	 * @return hoursSum
	 **/
	@ApiModelProperty(required = true, value = "Всего отработано часов за месяц")
	public Double getHoursSum() {
		return hoursSum;
	}

	public void setHoursSum(Double hoursSum) {
		this.hoursSum = hoursSum;
	}

	public Accrued incomesNatural(IncomesNatural incomesNatural) {
		this.incomesNatural = incomesNatural;
		return this;
	}

	/**
	 * Get incomesNatural
	 * 
	 * @return incomesNatural
	 **/
	@ApiModelProperty(required = true, value = "")
	public IncomesNatural getIncomesNatural() {
		return incomesNatural;
	}

	public void setIncomesNatural(IncomesNatural incomesNatural) {
		this.incomesNatural = incomesNatural;
	}

	public Accrued incomeNaturalSum(Double incomeNaturalSum) {
		this.incomeNaturalSum = incomeNaturalSum;
		return this;
	}

	/**
	 * Всего доходов в натуральной форме
	 * 
	 * @return incomeNaturalSum
	 **/
	@ApiModelProperty(required = true, value = "Всего доходов в натуральной форме")
	public Double getIncomeNaturalSum() {
		return incomeNaturalSum;
	}

	public void setIncomeNaturalSum(Double incomeNaturalSum) {
		this.incomeNaturalSum = incomeNaturalSum;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Accrued accrued = (Accrued) o;
		return Objects.equals(this.incomes, accrued.incomes) && Objects.equals(this.incomeSum, accrued.incomeSum)
				&& Objects.equals(this.hoursSum, accrued.hoursSum)
				&& Objects.equals(this.incomesNatural, accrued.incomesNatural)
				&& Objects.equals(this.incomeNaturalSum, accrued.incomeNaturalSum);
	}

	@Override
	public int hashCode() {
		return Objects.hash(incomes, incomeSum, hoursSum, incomesNatural, incomeNaturalSum);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Accrued {\n");

		sb.append("    incomes: ").append(toIndentedString(incomes)).append("\n");
		sb.append("    incomeSum: ").append(toIndentedString(incomeSum)).append("\n");
		sb.append("    hoursSum: ").append(toIndentedString(hoursSum)).append("\n");
		sb.append("    incomesNatural: ").append(toIndentedString(incomesNatural)).append("\n");
		sb.append("    incomeNaturalSum: ").append(toIndentedString(incomeNaturalSum)).append("\n");
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
