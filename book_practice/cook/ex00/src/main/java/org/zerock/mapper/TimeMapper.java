package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
//	�޼��� ������ interface����, sql�� xml���� ( xml���� namespace ���� interface�� ���� )
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();

	public String getTime2();

}
