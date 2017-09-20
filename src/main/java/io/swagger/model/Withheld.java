package io.swagger.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Taxes;



/**
 * 
 **/

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

@Entity
public class Withheld   {
	@Id
	@Column
	private String id = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
  private Taxes taxes = null;

  @Column
  private Double taxSum = null;

  @Column
  private Double cashboxSum = null;

  @Column
  private Double bankSum = null;

  @Column
  private Double debtEmployee = null;

  @Column
  private Double deptCompany = null;

  public Withheld taxes(Taxes taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(required = true, value = "")
  public Taxes getTaxes() {
    return taxes;
  }

  public void setTaxes(Taxes taxes) {
    this.taxes = taxes;
  }

  public Withheld taxSum(Double taxSum) {
    this.taxSum = taxSum;
    return this;
  }

   /**
   * Всего удержано и перечислено
   * @return taxSum
  **/
  @ApiModelProperty(required = true, value = "Всего удержано и перечислено")
  public Double getTaxSum() {
    return taxSum;
  }

  public void setTaxSum(Double taxSum) {
    this.taxSum = taxSum;
  }

  public Withheld cashboxSum(Double cashboxSum) {
    this.cashboxSum = cashboxSum;
    return this;
  }

   /**
   * К выплате через кассу
   * @return cashboxSum
  **/
  @ApiModelProperty(required = true, value = "К выплате через кассу")
  public Double getCashboxSum() {
    return cashboxSum;
  }

  public void setCashboxSum(Double cashboxSum) {
    this.cashboxSum = cashboxSum;
  }

  public Withheld bankSum(Double bankSum) {
    this.bankSum = bankSum;
    return this;
  }

   /**
   * К перечислению через банк
   * @return bankSum
  **/
  @ApiModelProperty(required = true, value = "К перечислению через банк")
  public Double getBankSum() {
    return bankSum;
  }

  public void setBankSum(Double bankSum) {
    this.bankSum = bankSum;
  }

  public Withheld debtEmployee(Double debtEmployee) {
    this.debtEmployee = debtEmployee;
    return this;
  }

   /**
   * Долг за сотрудником
   * @return debtEmployee
  **/
  @ApiModelProperty(required = true, value = "Долг за сотрудником")
  public Double getDebtEmployee() {
    return debtEmployee;
  }

  public void setDebtEmployee(Double debtEmployee) {
    this.debtEmployee = debtEmployee;
  }

  public Withheld deptCompany(Double deptCompany) {
    this.deptCompany = deptCompany;
    return this;
  }

   /**
   * Долг за предприятием
   * @return deptCompany
  **/
  @ApiModelProperty(required = true, value = "Долг за предприятием")
  public Double getDeptCompany() {
    return deptCompany;
  }

  public void setDeptCompany(Double deptCompany) {
    this.deptCompany = deptCompany;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Withheld withheld = (Withheld) o;
    return Objects.equals(this.taxes, withheld.taxes) &&
        Objects.equals(this.taxSum, withheld.taxSum) &&
        Objects.equals(this.cashboxSum, withheld.cashboxSum) &&
        Objects.equals(this.bankSum, withheld.bankSum) &&
        Objects.equals(this.debtEmployee, withheld.debtEmployee) &&
        Objects.equals(this.deptCompany, withheld.deptCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxes, taxSum, cashboxSum, bankSum, debtEmployee, deptCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Withheld {\n");
    
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    taxSum: ").append(toIndentedString(taxSum)).append("\n");
    sb.append("    cashboxSum: ").append(toIndentedString(cashboxSum)).append("\n");
    sb.append("    bankSum: ").append(toIndentedString(bankSum)).append("\n");
    sb.append("    debtEmployee: ").append(toIndentedString(debtEmployee)).append("\n");
    sb.append("    deptCompany: ").append(toIndentedString(deptCompany)).append("\n");
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

