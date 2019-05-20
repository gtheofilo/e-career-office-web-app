<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student | Edit Information</title>
    <meta charset="UTF-8">
    <c:import url="/WEB-INF/views/styles.jsp"></c:import>
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top"
      cz-shortcut-listen="true">

<!-- Navigation -->
<c:import url="/WEB-INF/views/nav.jsp"></c:import>
<div class="content-wrapper">
    <div class="container-fluid">

        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="<c:url value="/student"/>">Student</a></li>
        </ol>

        <div class="card mb-3">
            <div class="card-header">
                <i class="fas fa-user-edit"></i>Update your personal information</div>
            <div class="card-body">
                <form method="post" action="student_crud">
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input id="password" class="form-control" type="password" name="password" placeholder="Password" required />
                    </div>
                    <div class="form-group">
                        <label for="firstname">First Name</label>
                        <input id="firstname" class="form-control" type="text" name="firstname" placeholder="First name" value="${user.getName()}" required />
                    </div>
                    <div class="form-group">
                        <label for="lastname">Last Name</label>
                        <input id="lastname" class="form-control" type="text" name="lastname" placeholder="Last name" value="${user.getSurname()}" required />
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input id="email" class="form-control" type="email" name="email" placeholder="email@gmail.com" value="${user.getEmail()}" required />
                    </div>
                    <div class="form-group">
                        <label for="phone">Phone</label>
                        <input id="phone" class="form-control" type="text" pattern="\d*" maxlength="10" name="phone" value="${user.getPhoneNumber()}" placeholder="Phone" />
                    </div>
                    <div class="form-group">
                        <label for="phone">Role</label>
                        <br/>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="roleRadio1" value="u_student">
                            <label class="form-check-label" for="roleRadio1">Undergraduate student</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="roleRadio2" value="p_student">
                            <label class="form-check-label" for="roleRadio2">Postgraduate student</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="roleRadio3" value="external">
                            <label class="form-check-label" for="roleRadio3">External</label>
                        </div>
                    </div>
                    <br/>
                    <input  type="submit" class="btn btn-primary btn-block" value="Update">
                </form>
            </div>
        </div>

        <c:import url="/WEB-INF/views/footer.jsp"></c:import>
    </div>

    <c:import url="/WEB-INF/views/scripts.jsp"></c:import>


</body>
</html>
