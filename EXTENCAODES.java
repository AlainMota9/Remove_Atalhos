
/** 
 * @author Alain Louzeiro Mota
 * @version 1.0 
 */

package PROTECAO;

import java.io.IOException;
import javax.swing.JOptionPane;

public class EXTENCAODES{
    
    
        
   public EXTENCAODES(){//Construtor 
            
}
   

public void PENF(){
    EXTENCAODES.UnidadeF();
}

public void PENG(){
    EXTENCAODES.UnidadeG();
}

public void PENH(){
    EXTENCAODES.UnidadeH();
}

public void PENE(){
    EXTENCAODES.UnidadeE();
}

private static void UnidadeF (){

String TAKEOWN1 = "/f \"F:\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"F:\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"F:\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"F:\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"F:\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"F:\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"F:\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"F:\\*.lnk\"";
String DEL2 = "del /Q \"F:\\*.vbs\"";

String RD1 = "rd /S /Q \"F:\\.Trashes\"";
String RD2 = "rd /S /Q \"F:\\.Dtrashes\"";           

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace(); 
 } 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "Atalhos removidos!");
System.exit(0);

}//FIM DO MÉTODO DESISTALAÇÃO

private static void UnidadeG (){

String TAKEOWN1 = "/f \"G:\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"G:\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"G:\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"G:\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"G:\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"G:\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"G:\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"G:\\*.lnk\"";
String DEL2 = "del /Q \"G:\\*.vbs\"";

String RD1 = "rd /S /Q \"G:\\.Trashes\"";
String RD2 = "rd /S /Q \"G:\\.Dtrashes\"";           

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "Atalhos removidos!");
System.exit(0);
}//FIM DO MÉTODO DESISTALAÇÃO

private static void UnidadeH (){

String TAKEOWN1 = "/f \"H:\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"H:\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"H:\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"H:\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"H:\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"H:\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"H:\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"H:\\*.lnk\"";
String DEL2 = "del /Q \"H:\\*.vbs\"";

String RD1 = "rd /S /Q \"H:\\.Trashes\"";
String RD2 = "rd /S /Q \"H:\\.Dtrashes\"";           

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "Atalhos removidos!");
System.exit(0);
}//FIM DO MÉTODO DESISTALAÇÃO

private static void UnidadeE (){

String TAKEOWN1 = "/f \"E:\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"E:\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"E:\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"E:\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"E:\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"E:\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"E:\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"E:\\*.lnk\"";
String DEL2 = "del /Q \"E:\\*.vbs\"";

String RD1 = "rd /S /Q \"E:\\.Trashes\"";
String RD2 = "rd /S /Q \"E:\\.Dtrashes\"";           

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "Atalhos removidos!");
System.exit(0);
}//FIM DO MÉTODO DESISTALAÇÃO


}



