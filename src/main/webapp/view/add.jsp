<%--
  Created by IntelliJ IDEA.
  User: Luannv
  Date: 11/8/2023
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <h1 class="text-center text-danger">Thêm mới nhân viên </h1>
            <form action="<%=request.getContextPath()%>/nhan-vien" method="POST">
                <div class="form-group">
                    <label for="exampleInputEmail1">Mã Nhân viên</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" name="employeeCode">

                </div>
                <div class="form-group">
                    <label for="fullName">Họ Và Tên </label>
                    <input type="text" class="form-control" id="fullName" name="fullName">
                </div>
                <div class="form-group">
                    <label for="age">Tuổi </label>
                    <input type="text" class="form-control" id="age" name="age">
                </div>
                <div class="form-group">
                    <label for="salary">Lương c bản </label>
                    <input type="text" class="form-control" id="salary" name="salary">
                </div>
                <button type="submit" class="btn btn-primary">Add New</button>
            </form>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>