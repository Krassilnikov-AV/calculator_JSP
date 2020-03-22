
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CalcServl", urlPatterns = {"/CalcServl"})
public class CalcServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        boolean butAdd = request.getParameter("add_button") != null;   // кнопка в нажатом состоянии
        boolean butMult = request.getParameter("multy_button") != null;  
        
        String field1;
        String field2;
        Double num1, num2;
        Double result;
        
        if (butAdd){
          field1 = request.getParameter("addP1"); // получение первогого введенного параметра  
          field2 = request.getParameter("addP2"); // получение второго введенного параметра 
          try {
            num1 = Double.valueOf(field1);  // преобразование первого числа в double
            num2 = Double.valueOf(field2);   // преобразование второго числа в double 
            result = num1 + num2;              // получение суммы введенных чисел
            request.setAttribute("result", result.toString());   // передача данных их сервлета в jsp
          }
          catch (NumberFormatException ex){
            request.setAttribute("result", "bad result: "+ ex.getMessage());        
          }          
        } 
        else if(butMult) {
         field1 = request.getParameter("multp1");   
         field2 = request.getParameter("multp2");
          try {
            num1 = Double.valueOf(field1);          // преобразование первого числа в double
            num2 = Double.valueOf(field2);          // преобразование второго числа в double
            result = num1 * num2;
            request.setAttribute("result", result.toString());
          }
          catch (NumberFormatException ex){
            request.setAttribute("result", "bad result: "+ ex.getMessage());        
          }
        }        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

     /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}