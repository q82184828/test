package org.publicmethod;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

/**
 * @Author chenfei
 * @Date 2017年10月30日 下午12:21:42
 */
@Service
@Transactional
public class DictServiceImpl implements DictService {
	public String test() {
		return "调用了test方法";
	}
}
