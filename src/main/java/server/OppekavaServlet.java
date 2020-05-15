package server;

import school.ained.Aine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OppekavaServlet extends HttpServlet {

    private Aine aine = new Aine("RT-002", "ENESEJUHTIMINE", 4);
    private Aine aine2 = new Aine("RT-003", "KOOSTÖÖMUDELID", 2);
    private Aine aine3 = new Aine("RT-004", "SUHTLEMISPSÜHHOLOOGIA", 4);
    private Aine aine4 = new Aine("RT-005", "DISKREETNE MATEMAATIKA JA LOOGIKA", 5);
    private Aine aine5 = new Aine("RT-006", "LINEAARALGEBRA", 5);
    private Aine aine6 = new Aine("RT-007", "IT SOTSIAALSED JA EETILISED ALUSED", 2);
    private Aine aine7 = new Aine("RT-008", "UURIMISTÖÖ MEETODID", 5);
    private Aine aine8 = new Aine("RT-009", "ANDMEANALÜÜS", 3);
    private Aine aine9 = new Aine("RT-010", "OPERATSIOONISÜSTEEMID", 3);
    private Aine aine10 = new Aine("RT-011", "ARVUTID JA ARVUTIVÕRGUD", 2);
    private Aine aine11 = new Aine("RT-012", "PROGRAMMEERIMISE ALUSED", 5);
    private Aine aine12 = new Aine("RT-013", "ANDMETURVE", 4);
    private Aine aine13 = new Aine("RT-014", "PROGRAMMEERIMINE KEELES C", 6);
    private Aine aine14 = new Aine("RT-015", "SISSEJUHATAV ERIALAPRAKTIKA", 5);
    private Aine aine15 = new Aine("RT-016", "OBJEKTORIENTEERITUD PROGRAMMEERIMINE", 5);
    private Aine aine16 = new Aine("RT-017", "ANDMEBAASID", 4);
    private Aine aine17 = new Aine("RT-018", "VEEBIRAKENDUSED", 5);
    private Aine aine18 = new Aine("RT-019", "KASUTAJALIIDESE PROTOTÜÜPIMINE", 2);
    private Aine aine19 = new Aine("RT-020", "AUTOMAATTESTIMINE", 4);
    private Aine aine20 = new Aine("RT-021", "TARKVARATEHNIKA ERIALAPRAKTIKA", 10);
    private Aine aine21 = new Aine("RT-022", "AUTOMAATTESTIMISE ERIALAPRAKTIKA", 10);
    private Aine aine22 = new Aine("RT-023", "AUTOMAATJUHTIMINE", 5);
    private Aine aine23 = new Aine("RT-024", "SISSEJUHATUS MEHHATROONIKASSE", 5);
    private Aine aine24 = new Aine("RT-025", "PROGRAMMEERITAVAD JUHTSEADMED", 5);
    private Aine aine25 = new Aine("RT-026", "MEHHATROONIKA SÜSTEEMI PROJEKTEERIMINE", 5);
    private Aine aine26 = new Aine("RT-027", "SERVOMOOTORID", 5);
    private Aine aine27 = new Aine("RT-028", "ROBOOTIKA ERIALAPRAKTIKA", 10);
    private Aine aine28 = new Aine("RT-029", "AUTOMAATJUHTIMISE ERIALAPRAKTIKA", 10);
    private Aine aine29 = new Aine("RT-030", "TARKVARATEHNIKA MEESKONNAPROJEKT", 5);
    private Aine aine30 = new Aine("RT-031", "ROBOOTIKATARKVARA ARENDUSE ERIALAPRAKTIKA (PROJEKT)", 10);
    private Aine aine31 = new Aine("RT-032", "LÕPUTÖÖ (PROJEKT)", 10);

    Aine [] ained = {aine, aine2, aine3, aine4, aine5, aine6, aine7,  aine8, aine9, aine10,
            aine11, aine12, aine13, aine14, aine15, aine16, aine17, aine18, aine19, aine20,
            aine21, aine22, aine23, aine24, aine25, aine26, aine27, aine28, aine29, aine30, aine31};

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        for (Aine aine : ained) {
            response.getWriter().println("Aine kood: " + aine.getAineKood() + "\n" + "Aine nimetus: " + aine.getAineNimetus() + "\n" + "Aine EAP väärtus: " + aine.getAinePunktideArv() + "\n" + "---------------------------");
        }
    }


}
