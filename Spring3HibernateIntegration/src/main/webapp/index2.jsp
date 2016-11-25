<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<%-- <form:form action="/rm/saveEmployeeDetails" name="empdetails" modelAttribute="employee" > --%>
<form:form method="get" action="/Spring3HibernateIntegration/getemployeedetails" modelAttribute="employee">

<div> 
	<label for="firstNameInput">First Name</label> 
	<input name="firstName" id="firstNameInput" required="required" type="text" placeholder="Enter First Name" > 
<!-- </div> -->

<!-- <div>  -->
	<label for="lastNameInput">Last Name</label> 
	<input name="lastName" id="lastNameInput" type="text" placeholder="Enter Last Name">
<!-- </div> -->
<label for="EmpId">EmpID</label> 
	<input name="empId" id="empId" type="text" required="required" placeholder="Enter empID">
<!-- <div>  -->
<label for="typeSelect">Resource Type</label> 
	<select id="resourceTypeId" name="resourceType">
		<option value="" selected=""  class="">Please select</option>
		<option value="1">India-External</option>
		<option value="2">India-Own</option>
		<option value="3">NAR-External</option>
		<option value="4">NAR-Group</option>
		<option value="5">NAR-Own</option>
		<option value="6">NAR-Secondee</option>
	</select> 
<!-- </div> -->

<!-- <div>  -->
	<label for="levelInput">Capgemini Level</label> 
	<select id="levelInput" name="level">
		<option value="" selected="" class="">Please select</option>
		<option value="1">Principal</option>
		<option value="2">Senior VP</option>
		<option value="3">Vice President</option>
		<option value="4">Director</option>
		<option value="5">Associate Director</option>
		<option value="6">Manager</option>
		<option value="7">Senior Manager</option>
		<option value="8">Senior Consultant</option>
		<option value="9">Sr. Software Engineer</option>
		<option value="10">Consultant</option>
		<option value="11">Software Engineer</option>
		<option value="12">System Associate</option>
		<option value="13">N/A</option>
	</select>
<!-- </div> -->
<!-- <div>  -->
	<label for="accSelect">Account</label> 
	<select id="accSelect" name="account">
		<option value="" selected="" class="">Please select</option>
		<option value="2">Disney</option>
		<option value="1">Cisco</option>
		<option value="3">Lowe's</option>
		<option value="8">Manheim</option>
		<option value="9">RCCL</option>
	</select> 
</div>

<div></div><div></div><div></div><div></div>
<div> 
<!-- <button id="searchButton" ng-click="roster_form.$valid &amp;&amp; saveRoster(false);" class="btn btn-success"> 
<span class="glyphicon glyphicon-ok"></span>&nbsp;Save </button>
 <button ng-show="roster.objectId == null" ng-click="roster_form.$valid &amp;&amp; saveRoster(true);" class="btn btn-primary"> <span class="glyphicon glyphicon-plus-sign"></span>&nbsp;Add more </button> <button ng-show="roster.objectId != null" ng-click="deleteMetaModal();" class="btn btn-primary ng-hide"> <span class="glyphicon glyphicon-minus"></span>&nbsp;Delete </button> <button id="searchButton" type="button" ng-click="resetRoster();" class="btn btn-warning"> <span class="glyphicon glyphicon-repeat"></span>&nbsp;Reset </button> <button id="cancelButton" ng-click="cancelRoster();" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span>&nbsp;Cancel </button> </div> -->
<input type="submit" value="Save"/>
</div>
</form:form>
</body>
</html>
