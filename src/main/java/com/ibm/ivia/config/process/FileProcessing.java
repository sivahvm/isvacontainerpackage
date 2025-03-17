package com.ibm.ivia.config.process;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ibm.ivia.config.model.DBConfig;
import com.ibm.ivia.config.model.EnvConfig;
import com.ibm.ivia.config.model.IviaopConf;
import com.ibm.ivia.config.model.LdapConf;
import com.ibm.ivia.config.model.RPConf;
import com.ibm.ivia.config.model.ReverseProxyConf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
@Component
public class FileProcessing {
	
	
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Value("${iviaapp.docker.RP}")
	private String dockerRp;

	
	@Value("${iviaapp.docker.output}")
	private String dockeroutput;

	
	@Value("${iviaapp.docker.template}")
	private String dockerTemplate;

	
	@Value("${iviaapp.common.template}")
	private String commonTemplate;

	  private String getTemplateContent( File myObj) {
		  
		  String data = "";
	    try {

	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	         data = data+myReader.nextLine()+"\n";
	        // log.info(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	    	log.error("An error occurred.");
	      e.printStackTrace();
	    }
		return data;
	  }
	  
	  
 public String updateEnvFileData( HttpSession session) {
    
	 		File myObj = new File(commonTemplate+"env-config-template.sh");
	 		File writeObj = new File(dockeroutput+"/common/env-config.sh");

	 	
	 		String finaledata =  ""+getTemplateContent(myObj);
	 		String envFileLabel="__MY_LMI_IP__,__MY_WEB1_IP__,__RUNTIME_VERSION__,__DSC_VERSION__,__ISVA_VERSION__,__LDAP_VERSION__,__DB_VERSION__,__IVIAOP_VERSION__";
	 		List<String> constants=  Arrays.asList(envFileLabel.split(","));

		  EnvConfig envConfig= (EnvConfig)session.getAttribute("genConf");
		  
		  ReverseProxyConf rpconf= (ReverseProxyConf)session.getAttribute("rplconf");
		  LdapConf ldapConf= (LdapConf)session.getAttribute("ldapConf");
		  DBConfig dbconf= (DBConfig)session.getAttribute("dbconf");
		  IviaopConf iviaconf= (IviaopConf)session.getAttribute("iviaconf");


	    try {
	    	for (String key : constants) {
	    		
	    		
				switch (key) {
					case "__MY_LMI_IP__":	
						finaledata=finaledata.replace("__MY_LMI_IP__", envConfig.getLmiIp());						
						break;
					case "__ISVA_VERSION__":	
						finaledata=finaledata.replace("__ISVA_VERSION__", envConfig.getIviaconfigV());						
						break;
					case "__LDAP_VERSION__":	
						finaledata=finaledata.replace("__LDAP_VERSION__", ldapConf.getLdapV());						
						break;
					case "__DB_VERSION__":	
						finaledata=finaledata.replace("__DB_VERSION__", dbconf.getDbV());						
						break;
					case "__IVIAOP_VERSION__":	
						finaledata=finaledata.replace("__IVIAOP_VERSION__", iviaconf.getIviaopV());						
						break;
					case "__DSC_VERSION__":	
						finaledata=finaledata.replace("__DSC_VERSION__", iviaconf.getDscV());						
						break;
					case "__RUNTIME_VERSION__":	
						finaledata=finaledata.replace("__RUNTIME_VERSION__", envConfig.getRuntimeV());		  				
						break;
				default:
					break;
				}
				
				
			}
	      
	    } catch (Exception e) {

	      e.printStackTrace();
	    }
	    
	    log.info("finaledata : "+finaledata);
	    writeFileContent(writeObj,finaledata);
		return finaledata;
	  }
 
 public String getConfigupdateData( HttpSession session,String finaledata) {
	    
		
		String envFileLabel="__ivia__,__vol_iviaconfig__,__vol_libldap__,__vol_libsecauthority__,__vol_ldapslapd__,__vol_pgdata__,__DBREPO_URL__,__LDAPREPO_URL__,__IVIA_CONF_REPO_URL__,__RT_REPO_URL__,__DSC_REPOURL__,__IVIAOP_REPO_URL__,__TIME_ZOME__,__DBUSER__,__DBPWD__,__DBNAME__,__DBHNAME__,__DBPODNAME__,__LDAPHNAME__,__LDAPPODNAME__,__LDAPDOMNAME__,__LDAP_AD_PWD__,__LDAP_CONF_PWD__,__LDAP_PORT__,__LMIHNAME__,__LMIPODNAME__,__LMI_PWD__,__LMI_PORT__,__RTHNAME__,__RTPODNAME__,__DSCHNAME__,__DSCPODNAME__,__DSC_INS__,__IVIAOPHNAME__,__IVIAPODNAME__,__IVIAOP_INS_NAME__";
		List<String> constants=  Arrays.asList(envFileLabel.split(","));

	  EnvConfig envConfig= (EnvConfig)session.getAttribute("genConf");	  
	  LdapConf ldapConf= (LdapConf)session.getAttribute("ldapConf");
	  DBConfig dbconf= (DBConfig)session.getAttribute("dbconf");
	  IviaopConf iviaconf= (IviaopConf)session.getAttribute("iviaconf");


 try {
 	for (String key : constants) {
 		
 		
			switch (key) {
				case "__ivia__":	
					finaledata=finaledata.replace("__ivia__", envConfig.getNetworkname());						
					break;
				case "__vol_iviaconfig__":	
					finaledata=finaledata.replace("__vol_iviaconfig__", envConfig.getIviaconfiglabel());						
					break;
				case "__vol_libldap__":	
					finaledata=finaledata.replace("__vol_libldap__", ldapConf.getLibldaplabel());						
					break;
				case "__vol_libsecauthority__":	
					finaledata=finaledata.replace("__vol_libsecauthority__", ldapConf.getLibsecauthoritylabel());						
					break;
				case "__vol_ldapslapd__":	
					finaledata=finaledata.replace("__vol_ldapslapd__", ldapConf.getLdapslapdlabel());						
					break;
				case "__vol_pgdata__":	
					finaledata=finaledata.replace("__vol_pgdata__", dbconf.getDblabel());						
					break;
				case "__DBREPO_URL__":	
					finaledata=finaledata.replace("__DBREPO_URL__", dbconf.getPostgresqlRepUrl());						
					break;
				case "__LDAPREPO_URL__":	
					finaledata=finaledata.replace("__LDAPREPO_URL__", ldapConf.getIviaLdapRepUrl());						
					break;
				case "__RT_REPO_URL__":	
					finaledata=finaledata.replace("__RT_REPO_URL__", envConfig.getRuntimeRepUrl());						
					break;
				case "__IVIA_CONF_REPO_URL__":	
					finaledata=finaledata.replace("__IVIA_CONF_REPO_URL__", envConfig.getIviaconfigRepUrl());						
					break;
				case "__DSC_REPOURL__":	
					finaledata=finaledata.replace("__DSC_REPOURL__", iviaconf.getDscRepUrl());						
					break;
				case "__IVIAOP_REPO_URL__":	
					finaledata=finaledata.replace("__IVIAOP_REPO_URL__", iviaconf.getIviaopRepUrl());						
					break;
				case "__TIME_ZOME__":	
					finaledata=finaledata.replace("__TIME_ZOME__", envConfig.getTimezone());						
					break;
					
				case "__DBUSER__":	
					finaledata=finaledata.replace("__DBUSER__", dbconf.getDbuname());						
					break;
				case "__DBNAME__":	
					finaledata=finaledata.replace("__DBNAME__", dbconf.getDbname());						
					break;
				case "__DBPWD__":	
					finaledata=finaledata.replace("__DBPWD__", dbconf.getDbpwd());						
					break;
				case "__DBHNAME__":	
					finaledata=finaledata.replace("__DBHNAME__", dbconf.getDbhostname());					
					break;
				case "__DBPODNAME__":	
					finaledata=finaledata.replace("__DBPODNAME__", dbconf.getDbpodlabel());						
					break;
				case "__LDAPHNAME__":	
					finaledata=finaledata.replace("__LDAPHNAME__", ldapConf.getLdaphost());						
					break;
				case "__LDAPPODNAME__":	
					finaledata=finaledata.replace("__LDAPPODNAME__", ldapConf.getLdappodlabel());						
					break;
				case "__LDAPDOMNAME__":	
					finaledata=finaledata.replace("__LDAPDOMNAME__", ldapConf.getLdapDomain());						
					break;
				case "__LDAP_AD_PWD__":	
					finaledata=finaledata.replace("__LDAP_AD_PWD__", ldapConf.getLdapadminpwd());						
					break;
				case "__LDAP_CONF_PWD__":	
					finaledata=finaledata.replace("__LDAP_CONF_PWD__", ldapConf.getLdapconfpwd());						
					break;
				case "__LDAP_PORT__":	
					finaledata=finaledata.replace("__LDAP_PORT__", ldapConf.getLdapport());						
					break;
				case "__LMIHNAME__":	
					finaledata=finaledata.replace("__LMIHNAME__", envConfig.getLmihostname());						
					break;
				case "__LMIPODNAME__":	
					finaledata=finaledata.replace("__LMIPODNAME__", envConfig.getIviaconfiglabel());						
					break;
				case "__LMI_PWD__":	
					finaledata=finaledata.replace("__LMI_PWD__", envConfig.getLmiadminpwd());						
					break;

				case "__LMI_PORT__":	
					finaledata=finaledata.replace("__LMI_PORT__", envConfig.getLmiport());						
					break;
				case "__RTHNAME__":	
					finaledata=finaledata.replace("__RTHNAME__", envConfig.getRuntimehostname());						
					break;
				case "__RTPODNAME__":	
					finaledata=finaledata.replace("__RTPODNAME__", envConfig.getRuntimepodlabel());						
					break;
				case "__DSCHNAME__":	
					finaledata=finaledata.replace("__DSCHNAME__", iviaconf.getDschostname());						
					break;
				case "__DSCPODNAME__":	
					finaledata=finaledata.replace("__DSCPODNAME__", iviaconf.getDsclabel());						
					break;
				case "__DSC_INS__":	
					finaledata=finaledata.replace("__DSC_INS__", iviaconf.getDscinstance());						
					break;
				case "__IVIAOPHNAME__":	
					finaledata=finaledata.replace("__IVIAOPHNAME__", iviaconf.getIviaophostname());						
					break;
				case "__IVIAPODNAME__":	
					finaledata=finaledata.replace("__IVIAPODNAME__", iviaconf.getIviaoppodlabel());						
					break;
				case "__IVIAOP_INS_NAME__":	
					finaledata=finaledata.replace("__IVIAOP_INS_NAME__", iviaconf.getIviaopinstance());						
					break;
			default:
				break;
			}
			
			
		}
   
 } catch (Exception e) {

   e.printStackTrace();
 }
 
 log.info("finaledata : "+finaledata);

	return finaledata;
}

 public String getReverseProxyConfigupdateData( HttpSession session,String finaledata,RPConf rpConfObj,int seq) {
	    
		String envFileLabel="__SEQ_IP__,__vol_iviaconfig__,__RP_HNAME__,__RP_POD_NAME__,__TIME_ZOME__,__RP_PORT__,__RP_INSNAME__,__ivia__,__RP_RPOURL__,__RP_VER__";
		List<String> constants=  Arrays.asList(envFileLabel.split(","));

	  EnvConfig envConfig= (EnvConfig)session.getAttribute("genConf");	  
	  ReverseProxyConf rpconf= (ReverseProxyConf)session.getAttribute("rplconf");


try {
	
		
		for (String key : constants) {
			
			switch (key) {
				case "__ivia__":	
					finaledata=finaledata.replace("__ivia__", envConfig.getNetworkname());						
					break;
				case "__vol_iviaconfig__":	
					finaledata=finaledata.replace("__vol_iviaconfig__", envConfig.getIviaconfiglabel());						
					break;
				
				case "__IVIAOP_INS_NAME__":	
					finaledata=finaledata.replace("__RP_HNAME__", rpConfObj.getRphostname());						
					break;
				case "__RP_POD_NAME__":	
					finaledata=finaledata.replace("__RP_POD_NAME__", rpConfObj.getRppodlabel());						
					break;
				case "__SEQ_IP__":	
					finaledata=finaledata.replace("__SEQ_IP__", ""+rpConfObj.getRpIp());						
					break;
				case "__TIME_ZOME__":	
					finaledata=finaledata.replace("__TIME_ZOME__", envConfig.getTimezone());						
					break;
				case "__RP_PORT__":	
					finaledata=finaledata.replace("__RP_PORT__", rpConfObj.getRpport());						
					break;					
				case "__RP_INSNAME__":	
					finaledata=finaledata.replace("__RP_INSNAME__", rpConfObj.getRpInstanceName());						
					break;
					
				case "__RP_RPOURL__":	
					finaledata=finaledata.replace("__RP_RPOURL__", rpconf.getRpRepUrl());						
					break;
					
				case "__RP_VER__":	
					finaledata=finaledata.replace("__RP_VER__", rpconf.getRpV());						
					break;
			default:
				break;
			}
			
			
				
	}
	
	

} catch (Exception e) {

e.printStackTrace();
}

log.info("finaledata : "+finaledata);

	return finaledata;
}
 
 public void writetoConfFile( HttpSession session ) {
	 
	 File myObj = new File(dockerTemplate+"docker-setup-template.sh");	 
		String finaldata =  ""+getTemplateContent(myObj);		
		File writeObj = new File(dockeroutput+"/docker/docker-setup.sh");	
		String updData =getConfigupdateData(session,finaldata);
		
		  ReverseProxyConf rpconf= (ReverseProxyConf)session.getAttribute("rplconf");
		  List<RPConf> rplist=rpconf.getRpConf();
		  int seq=1;
		  for (RPConf rpConfobj: rplist) {		
			  
				updData=updData+"\n"+getReverseProxyConfigupdateData(session,dockerRp,rpConfobj,seq++);
		  }
		writeFileContent(writeObj,updData);
 }
 
 private void writeFileContent( File myObj,String content) {
	try {  
	 FileWriter myWriter = new FileWriter(myObj);
     myWriter.write(content);
     myWriter.close();
     log.info("Successfully wrote to the file.");
   } catch (IOException e) {
	   log.info("writeFileContent An error occurred.");
     e.printStackTrace();
   }
 }
 public  void zipFolder(Path sourceFolderPath, Path zipPath) throws Exception {
	   ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
	   Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {
	       @Override
	       public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
	           zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(file).toString()));
	           Files.copy(file, zos);
	           zos.closeEntry();
	           return FileVisitResult.CONTINUE;
	        }
	    });
	    zos.close();
	 }
	
 
 public  void zipDirectory(String zipFileName, String rootDirectoryPath) throws IOException {
     File directoryObject = new File(rootDirectoryPath);
     if (!zipFileName.endsWith(".zip")) {
         zipFileName = zipFileName + ".zip";
     }
     ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
     addDirectory(directoryObject, out);
     out.close();
 }

 private  void addDirectory(File directoryObject, ZipOutputStream out) throws IOException {
     File[] files = directoryObject.listFiles();
     byte[] tmpBuf = new byte[1024];

     for (File file : files) {
         if (file.isDirectory()) {
             addDirectory(file, out);
             continue;
         }
         FileInputStream in = new FileInputStream(file.getAbsolutePath());
         out.putNextEntry(new ZipEntry(file.getAbsolutePath()));
         int len;
         while ((len = in.read(tmpBuf)) > 0) {
             out.write(tmpBuf, 0, len);
         }
         out.closeEntry();
         in.close();
     }
 }
}



