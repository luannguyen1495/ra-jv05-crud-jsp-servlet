package com.ra.controller;

import com.ra.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/nhan-vien")
public class EmployeeServlet extends HttpServlet {
    private  final List<Employee> list = new ArrayList<>();
    @Override
    public void init() throws ServletException {
        list.add(new Employee("NV01","Tien bip",15,1000));
        list.add(new Employee("NV01","Hoang Mat Goc",15,500));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // nhan method GET gui len tu client

        // kểm tra action
        String action = request.getParameter("action");
        if(action == null){
            // hienn thi danh sach
            getList(request,response);
            return;
        }
        switch (action){
            case "edit":
                // lay ve id
                String id = request.getParameter("id");
                Employee employee = findById(id);
                request.setAttribute("employee",employee);
                request.getRequestDispatcher("view/edit.jsp").forward(request,response);
                break;
            case "delete":
                // thục hien xia
                break;
            default:
                break;
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // nhận và xử lý request theo method POST
       String employeeCode = request.getParameter("employeeCode");
       String fullName = request.getParameter("fullName");
       Integer age = Integer.parseInt(request.getParameter("age"));
       Double salary = Double.parseDouble(request.getParameter("salary"));

       String action = request.getParameter("action");
       if(action == null){
           list.add(new Employee(employeeCode,fullName,age,salary));
       }else{

           Employee employee = findById(employeeCode);
           employee.setFullName(fullName);
           employee.setAge(age);
           employee.setSalary(salary);

         /*for (Employee employee : list){
             if (employee.getEmployeeCode().equals(employeeCode)){
                 employee.setFullName(fullName);
                 employee.setAge(age);
                 employee.setSalary(salary);
             }
         }*/

       }
       getList(request,response);
    }


    // tao phuong thuc getList()
    public  void getList(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.setAttribute("list",list);
        // chuyển dũ liệu req,res sang employee.jsp
        request.getRequestDispatcher("view/employee.jsp").forward(request,response);
    }

    public Employee findById(String id){
        for (Employee employee : list){
            if(employee.getEmployeeCode().equals(id))
                return employee;
        }
        return null;
    }
}