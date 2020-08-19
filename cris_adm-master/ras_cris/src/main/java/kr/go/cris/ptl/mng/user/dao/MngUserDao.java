package kr.go.cris.ptl.mng.user.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.go.cris.ptl.mng.code.vo.MngCodeVo;
import kr.go.cris.ptl.mng.user.vo.MngUserAuthVo;
import kr.go.cris.ptl.mng.user.vo.MngUserClsVo;
import kr.go.cris.ptl.mng.user.vo.MngUserLogVo;
import kr.go.cris.ptl.mng.user.vo.PTLLoginVo;

import org.springframework.stereotype.Repository;


/**
 *
 * <pre>
 * FileName: MngUserDao.java
 * Package : kr.go.cris.ptl.mng.user.dao
 *
 * mng 사용자 관리 Dao
 *
 * </pre>
 * @author : sbkang
 * @date   : 2015. 8. 27.
 */
@Repository
public interface MngUserDao {


	/**
	 *
	 * <pre>
	 * 사용자 관리 - 사용자 권한 코드 목록
	 *
	 * </pre>
	 * @author : sbkang
	 * @date   : 2015. 8. 27.
	 * @param loginid
	 * @return
	 */
	public List<MngCodeVo> listUsrAuth(String loginid);

	/**
	 *
	 * <pre>
	 * 사용자 관리 - 사용자 권한 목록
	 *
	 * </pre>
	 * @author : sbkang
	 * @date   : 2015. 8. 27.
	 * @return
	 */
	public List<MngCodeVo> listAuth();

	/**
	 *
	 * <pre>
	 * URL 관리  - 시스템 관리자를 제외한 사용자 권한 코드 목록
	 *
	 * </pre>
	 * @author : sbkang
	 * @date   : 2015. 10. 2.
	 * @return
	 */
	public List<MngCodeVo> listAdminExemptionAuth();



	/**
	 *
	 * <pre>
	 * 사용자 관리 - 사용자 목록 카운트
	 *
	 * </pre>
	 * @author : sbkang
	 * @date   : 2015. 8. 27.
	 * @param PTLLoginVo
	 * @return
	 */
	public int retrieveUserTotalCount(PTLLoginVo pTLLoginVo) throws IOException, SQLException , NullPointerException ;


    /**
	 * <pre>
	 * 사용자 관리 - 사용자 리스트 조회
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 2. 29.
	 * @param PTLLoginVo
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<PTLLoginVo> selectUserList(PTLLoginVo pTLLoginVo) throws IOException, SQLException , NullPointerException ;


   /**
    *
    * <pre>
    * 사용자 관리 - 사용자 상세 정보
    *
    * </pre>
    * @author : sbkang
    * @date   : 2015. 8. 27.
    * @param loginid
    * @return
    */
   public PTLLoginVo selectUserInfo(String loginid) throws IOException, SQLException , NullPointerException ;


   /**
    *
    * <pre>
    * 사용자 관리 - 사용자 권한 코드 카운트
    *
    * </pre>
    * @author : sbkang
    * @date   : 2015. 8. 27.
    * @param loginid
    * @return
    */
   public int selectCntUserAuth(String loginid);


   /**
    *
    * <pre>
    * 사용자 관리 - 사용자 권한 코드 저장
    *
    * </pre>
    * @author : sbkang
    * @date   : 2015. 8. 28.
    * @param valueMap
    * @return
    */
   public Boolean insertUserAuth(HashMap<String, Object> valueMap);



   /**
	 * <pre>
	 * 회원관리 - 사용자정보 수정
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 2. 24.
	 * @param PTLLoginVo
	 * @throws IOException, SQLException , NullPointerException
	 * @return
	*/
   public Boolean updateUser(PTLLoginVo pTLLoginVo)throws IOException, SQLException , NullPointerException ;

	/**
	  * <pre>
	  * 회원관리 - 사용자관심 저장
	  *
	  * </pre>
	  * @author : sejin
	  * @date   : 2016. 2. 24.
	  * @param mngUserClsVo
	  * @throws IOException, SQLException , NullPointerException
	*/
	public void insertUserCls(MngUserClsVo mngUserClsVo)throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 사용자관심 조회
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 2. 24.
	 * @param loginid
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<MngUserClsVo> selectUserCls(String loginid) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 사용자관심 삭제
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 2. 24.
	 * @param loginid
	 * @throws IOException, SQLException , NullPointerException
	 */
	public void deleteUserCls(String loginid) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 회원수 조회
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 2. 29.
	 * @param PTLLoginVo
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public int selectUserCnt(PTLLoginVo pTLLoginVo) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 회원 권한삭제
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 3. 2.
	 * @param mngUserAuthVo
	 * @throws IOException, SQLException , NullPointerException
	 */
	public void deleteUserAuth(String loginid) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 회원 권한등록
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 3. 2.
	 * @param mngUserAuthVo
	 * @throws IOException, SQLException , NullPointerException
	 */
	public void insertUserAuth(MngUserAuthVo mngUserAuthVo) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 회원 권한조회
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 3. 2.
	 * @param loginid
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<MngUserAuthVo> selectUserAuth(String loginid) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 회원관리 - 관리자메일조회
	 *
	 * </pre>
	 * @author : sejin
	 * @date   : 2016. 3. 24.
	 * @param auth
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<PTLLoginVo> selectMngInfo(String auth) throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 사용자로그 조회
	 *
	 * </pre>
	 * @author : Administrator
	 * @date   : 2016. 4. 26.
	 * @param PTLLoginVo
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<MngUserLogVo> selectUserLogList(MngUserLogVo mngUserLogVo)throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 사용자로그 조회(엑셀다운로드용)
	 *
	 * </pre>
	 * @author : Administrator
	 * @date   : 2016. 4. 28.
	 * @param mngUserLogVo
	 * @return
	 * @throws IOException, SQLException , NullPointerException
	 */
	public List<Map<String, String>> selectUserLogMap(MngUserLogVo mngUserLogVo)throws IOException, SQLException , NullPointerException ;

	/**
	 * <pre>
	 * 사용자 비밀번호 변경 랜덤숫자문자
	 *
	 * </pre>
	 * @author : Administrator
	 * @date   : 2016. 4. 29.
	 * @param PTLLoginVo
	 */
	public void updateChgPwd(PTLLoginVo pTLLoginVo)throws IOException, SQLException , NullPointerException ;
	

}
