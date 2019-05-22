package com.vibes.demo.lock.poc;

import java.util.concurrent.locks.Lock;

import org.mule.api.MuleContext;
import org.mule.api.context.MuleContextAware;

public class ApplicationLockUtil implements MuleContextAware {

	private MuleContext muleContext;

	@Override
	public void setMuleContext(MuleContext context) {
		// TODO Auto-generated method stub
		this.muleContext = context;
	}

	public boolean lock(String lockId) {
		Lock lock = this.muleContext.getLockFactory().createLock(lockId);
		return lock.tryLock();
	}

	public void unLock(String lockId) {
		Lock lock = this.muleContext.getLockFactory().createLock(lockId);
		lock.unlock();
	}
}
