
/*
 * 该类用于保存需要爬取的文件的后缀名，或者文件名
 * */

class CrawledFileName {
	static StringBuffer filenames;
	
	void addFileName(String name){
		String newname = name+':';
		filenames.append(newname);
	}
	void addFileNames(String name[]){
		for (int i = 0; i < name.length; i++) {
			String newname = name[i]+':';
			filenames.append(newname);
		}
	}
}
