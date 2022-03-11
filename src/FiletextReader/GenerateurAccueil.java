package FiletextReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateurAccueil {
    
    public static void main(String[] args) throws IOException {

        Path fileStaff = Path.of("./ressources/staff.txt");
        List<String> lines = Files.readAllLines(fileStaff);
        ArrayList<String> usernames =new ArrayList<String>();
        for (String line : lines) {
            //On isole le nom
            String username = line;
            usernames.add(username);
            Collections.sort(usernames);
        }
        try(
            FileWriter aw = new FileWriter("index.html", true);
            BufferedWriter ow = new BufferedWriter(aw);
            PrintWriter lout = new PrintWriter(ow))
            {
            ow.write("<html><head><title>FICHE AGENT</title></head><body style=background-color:#659224;><br><div><div align=center><img src=img/go.jpg width=450 height=300></div></div><br><div align=center><h1>LISTE DES AGENTS :</h1></div><div id=liste_agent style=text-align:center><a href="+usernames.get(0)+".html><label>"+usernames.get(0)+"</label></a><br><a href="+usernames.get(1)+".html><label>"+usernames.get(1)+"</label></a><br><a href="+usernames.get(2)+".html><label>"+usernames.get(2)+"</label></a><br><a href="+usernames.get(3)+".html><label>"+usernames.get(3)+"</label></a><br><a href="+usernames.get(4)+".html><label>"+usernames.get(4)+"</label></a><br><a href="+usernames.get(5)+".html><label>"+usernames.get(5)+"</label></a><br><a href="+usernames.get(6)+".html><label>"+usernames.get(6)+"</label></a><br><a href="+usernames.get(7)+".html><label>"+usernames.get(7)+"</label></a><br>");
            ow.close();
            }catch (IOException e) {}
    }

}
