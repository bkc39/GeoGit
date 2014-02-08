package org.geogit.api.porcelain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.geogit.api.plumbing.diff.DiffEntry;
import org.geogit.api.plumbing.merge.Conflict;

public class StatusSummary {
  private List<Conflict> conflicts;
  private Iterator<DiffEntry> staged, unstaged;
  private String message;
  
  private long countStaged;
  private long countUnstaged;
  private int countConflicts;
  
  
	public String getMessage() {
	return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public List<Conflict> getConflicts() {
		return conflicts;
	}
	
	public void setConflicts(List<Conflict> conflicts) {
		this.conflicts = conflicts;
	}
	
	public Iterator<DiffEntry> getStaged() {
		return staged;
	}
	
	public void setStaged(Iterator<DiffEntry> staged) {
		this.staged = staged;
	}
	
	public Iterator<DiffEntry> getUnstaged() {
		return unstaged;
	}
	
	public void setUnstaged(Iterator<DiffEntry> unstaged) {
		this.unstaged = unstaged;
	}

	
  public StatusSummary() {
    this.conflicts = new ArrayList<Conflict>();
    this.staged = null;
    this.unstaged = null;
    
  }

  public long getCountStaged() {
    return countStaged;
  }

  public void setCountStaged(long countStaged) {
    this.countStaged = countStaged;
  }

  public long getCountUnstaged() {
    return countUnstaged;
  }

  public void setCountUnstaged(long countUnstaged2) {
    this.countUnstaged = countUnstaged2;
  }

  public int getCountConflicts() {
    return countConflicts;
  }

  public void setCountConflicts(int countConflicts) {
    this.countConflicts = countConflicts;
  }
  
}
