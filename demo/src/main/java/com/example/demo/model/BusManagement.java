package com.example.demo.model;

import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;


/*@Entity(default)- A Class can be mapped to a table
 * @Table- Specifies the table name
 * @Dynamic Update- Updates the particular value to the attribute which we want to change instead of checking all the attributes.
 * @Id-Considers as a primary key
 * @Generated value(strategy=GenerationType.IDENTITY)- automatically generates the primary key values.
 * @Column-Specifies the column name*/


@Entity
@DynamicUpdate
@Table(name = "Bus_management")
public class BusManagement {

	/* scanner object private to this class is created to accept userInput */
	private static final Scanner scan=new Scanner(System.in);
	public BusManagement() {

	}
	private String startingPoint;
	private String endingPoint;
	private String driverName;
	private Long driverNumber;
	// @Id annotation denotes the primary key of the table created
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer busId;

	@Column(name="Bus_number",length=10)
	private String busNumber;
	private String busType;
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Long getDriverNumber() {
		return driverNumber;
	}
	public void setDriverNumber(Long driverNumber) {
		this.driverNumber = driverNumber;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Integer getbusId() {
		return busId;
	}
	public void setbusId(int busId) {
		this.busId = busId;
	}
	@Override
	public String toString() {
		return "BusManagement [startingPoint=" + startingPoint + ", endingPoint=" + endingPoint + ", driverName="
				+ driverName + ", driverNumber=" + driverNumber + ", busNumber=" + busNumber + ", busType=" + busType
				+ ",busId=" + busId +"]";
	}
}
