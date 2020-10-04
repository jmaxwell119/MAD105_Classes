// creates Employee class, class starts with capital letter, with constructor in parenthesis
class Employee(employeeName: String, employeeNumber: String, employeeShift: Int){
    var employeeName: String = ""
        // public getter
        get() = field
        // public setter
        set(value) {
            field = value
        }
    var employeeNumber: String = ""
        get() = field
        set(value) {
            field = value
        }
    var employeeShift: Int = 0
        get() = field
        set(value) {
            field = value
        }
    // initialize variables
    init {
        this.employeeName = employeeName
        this.employeeNumber = employeeNumber
        this.employeeShift = employeeShift
    }
    // function to display info, displays parameters of the class
    fun displayInfo(){
        println("employee name: " + employeeName + "\nemployee number: " + employeeNumber + "\nemployee shift: " + employeeShift.toString())
    }
}