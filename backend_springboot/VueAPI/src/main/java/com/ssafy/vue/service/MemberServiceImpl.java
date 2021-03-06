package com.ssafy.vue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dto.MemberDto;
import com.ssafy.vue.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return memberMapper.login(memberDto);
	}

	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return memberMapper.userInfo(userid);
	}
	@Override
	public boolean insertMember(MemberDto memberDto) {
		return memberMapper.insertMember(memberDto); 
		
	}

	@Override
	public boolean updateMember(MemberDto memberDto) {
		return memberMapper.updateMember(memberDto);
	}

	@Override
	public boolean deleteMember(String userid) {
		if(memberMapper.deleteMember(userid)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updatePic(MemberDto memberDto) {
		return memberMapper.updatePic(memberDto);
	}

	@Override
	public int checkId(String userid) {
		System.out.println(memberMapper.checkId(userid));
		return memberMapper.checkId(userid); 
	}



}
