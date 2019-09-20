package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 778766
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        if (edit == null) {
            // Access to the viewnote JSP
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            String lineOne = br.readLine();
            String lineTwo = br.readLine();
            Note n = new Note(lineOne, lineTwo);

            request.setAttribute("note", n);

            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp")
                    .forward(request, response);
            br.close();
        }
//        else {
//            // Access to the editnote JSP
//            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
//            String lineOne = br.readLine();
//            String lineTwo = br.readLine();
//            Note n = new Note(lineOne, lineTwo);
//            request.setAttribute("firstLine", n.getFirstLine());
//            request.setAttribute("secondLine", n.getSecondLine());
//
//            getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp")
//                    .forward(request, response);
//        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
