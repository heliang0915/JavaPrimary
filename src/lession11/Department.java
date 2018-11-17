package lession11;

public class Department {

	private String deptNo;
	private String deptName;
	private String deptAddress;

	public Department(String deptNo, String deptName, String deptAddress) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else {
			if (this == arg0) { // 同一个对象
				return false;
			}
			if (!(arg0 instanceof Department)) {
				return false;
			}
			Department dept = (Department) arg0;
			return this.getDeptNo().equals(dept.getDeptNo()) && this.getDeptName().equals(dept.getDeptName())
					&& this.getDeptAddress().equals(dept.getDeptAddress());
		}

	}

	@Override
	public String toString() {
		return "Department :[部门编号：" + this.deptNo + " 部门名称：" + this.deptName + " 部门地址:" + this.deptAddress + "]";
	}
}
