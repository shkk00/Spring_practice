package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor  //  ��ü ������ ����� ��θ� parameter�� �޴� ������ �ۼ�
//@RequiredArgsConstructor  //  if, Ư�� ������ ������ �ۼ��ϰ� ������  + @NonNull or final ���� ����
public class SampleHotel {
//	@NonNull
	private Chef chef;
	
	//  @AllArgsConstructor �ۼ� �� �ּ�ó��
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
}
