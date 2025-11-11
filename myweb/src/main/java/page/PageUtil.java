package page;

public class PageUtil {
	public static final int PAGE_SCALE = 10; // 한 페이지에 보여줄 게시물 수
	public static final int BLOCK_SCALE = 10; // 한 화면에 보여줄 페이지 수

	private int curPage; // 현재 페이지
	private int totPage; // 전체 페이지 수
	private int pageBegin; // 현재 페이지의 시작 게시물 번호
	private int pageEnd; // 현재 페이지의 끝 게시물 번호
	private int blockStart; // 현재 블록 시작 페이지 번호
	private int blockEnd; // 현재 플록 끝 페이지 번호
	private int prevPage; // 이전 페이지 번호
	private int nextPage; // 다음 페이지 번호
	private int curBlock; // 현재 페이지가 속한 블록 번호
	private int totBlock; // 전체 블록 수

	public PageUtil(int totalCount, int curPage) {
		this.curPage = curPage;
		this.totPage = (int) Math.ceil(totalCount / (double) PAGE_SCALE);
		this.totBlock = (int) Math.ceil(totPage / (double) BLOCK_SCALE);
		setPageRange();
		setBlockRange();
	}

	private void setPageRange() {
		pageBegin = (curPage - 1) * PAGE_SCALE + 1;
		pageEnd = Math.min(pageBegin + PAGE_SCALE - 1, totPage * PAGE_SCALE);
	}

	private void setBlockRange() {
		curBlock = (int) Math.ceil(curPage / (double) BLOCK_SCALE);
		blockStart = (curBlock - 1) * BLOCK_SCALE + 1;
		blockEnd = Math.min(blockStart + BLOCK_SCALE - 1, totPage);

		prevPage = (curBlock > 1) ? (blockStart - 1) : 1;
		nextPage = (blockEnd < totPage) ? (blockEnd + 1) : totPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public int getTotPage() {
		return totPage;
	}

	public int getPageBegin() {
		return pageBegin;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public int getBlockStart() {
		return blockStart;
	}

	public int getBlockEnd() {
		return blockEnd;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public int getCurBlock() {
		return curBlock;
	}

	public int getTotBlock() {
		return totBlock;
	}
}
