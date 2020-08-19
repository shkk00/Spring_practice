package kr.go.cris.ptl.scheduler.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import kr.go.cris.ptl.mng.sch.service.SchService;
import kr.go.cris.ptl.scheduler.service.SchedulerService;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * FileName: Scheduler.java
 * Package : kr.co.nst.commons.scheduler
 * 
 * 
 *
 * </pre>
 * @author : sejin 
 * @date   : 2019. 11. 29.
 */
@Component
public class SchedulerController {
	
	public static List<HashMap<String, String>> hotData = new ArrayList<HashMap<String, String>>(); //맵생성
	

	@Resource
	private SchedulerService schedulerService;
	
	//  초 분 시 일 월 요일
	/*  초 0-59 , - * / 
		분 0-59 , - * / 
		시 0-23 , - * / 
		일 1-31 , - * ? / L W
		월 1-12 or JAN-DEC , - * / 
		요일 1-7 or SUN-SAT , - * ? / L # 
		년(옵션) 1970-2099 , - * /
		* : 모든 값
		? : 특정 값 없음
		- : 범위 지정에 사용
		, : 여러 값 지정 구분에 사용
		/ : 초기값과 증가치 설정에 사용
		L : 지정할 수 있는 범위의 마지막 값
	   W : 월~금요일 또는 가장 가까운 월/금요일
	   # : 몇 번째 무슨 요일 2#1 => 첫 번째 월요일 
	   예제 
	   초 분 시 일 월 주(년)
	  "0 0 12 * * ?" : 아무 요일, 매월, 매일 12:00:00
	  "0 15 10 ? * *" : 모든 요일, 매월, 아무 날이나 10:15:00 
	  "0 15 10 * * ?" : 아무 요일, 매월, 매일 10:15:00 
	  "0 15 10 * * ? *" : 모든 연도, 아무 요일, 매월, 매일 10:15 
	  "0 15 10 * * ? : 2005" 2005년 아무 요일이나 매월, 매일 10:15 
	  "0 * 14 * * ?" : 아무 요일, 매월, 매일, 14시 매분 0초 
	   "0 0/5 14 * * ?" : 아무 요일, 매월, 매일, 14시 매 5분마다 0초 
	  "0 0/5 14,18 * * ?" : 아무 요일, 매월, 매일, 14시, 18시 매 5분마다 0초 
	  "0 0-5 14 * * ?" : 아무 요일, 매월, 매일, 14:00 부터 매 14:05까지 매 분 0초 
	  "0 10,44 14 ? 3 WED" : 3월의 매 주 수요일, 아무 날짜나 14:10:00, 14:44:00 
	  "0 15 10 ? * MON-FRI" : 월~금, 매월, 아무 날이나 10:15:00 
	  "0 15 10 15 * ?" : 아무 요일, 매월 15일 10:15:00 
	  "0 15 10 L * ?" : 아무 요일, 매월 마지막 날 10:15:00 
	  "0 15 10 ? * 6L" : 매월 마지막 금요일 아무 날이나 10:15:00 
	  "0 15 10 ? * 6L 2002-2005" : 2002년부터 2005년까지 매월 마지막 금요일 아무 날이나 10:15:00 
	  "0 15 10 ? * 6#3" : 매월 3번째 금요일 아무 날이나 10:15:00
	 */     
    //@Scheduled(cron="1 0/1 * * * ?")
    public void schedulerPro() throws NumberFormatException, ClassNotFoundException, SQLException{
    	
    	/**
    	 * 실행 스케줄 조회 1분단위로 조회
    	 */        
    	schedulerService.procEtl();
    	
    }
 
}