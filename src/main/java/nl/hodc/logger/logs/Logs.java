package nl.hodc.logger.logs;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Logs {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String clientIp;
   private String logInfo;
   private String logType;
   private String logTime;

   public long getId() {
      return this.id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getLogInfo() {
      return this.logInfo;
   }

   public void setLogInfo(String logInfo) {
      this.logInfo = logInfo;
   }

   public String getLogType() {
      return this.logType;
   }

   public void setLogType(String logType) {
      this.logType = logType;
   }

   public String getLogTime() {
      return this.logTime;
   }

   public void setLogTime(String logTime) {
      Calendar cal = Calendar.getInstance();
      Date startTime = cal.getTime();
      this.logTime = startTime.toString();
   }
}
