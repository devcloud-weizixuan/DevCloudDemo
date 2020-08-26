import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		// 读test_case.txt
		ArrayList<String> in = fromFile();
		// 1000组19个形状数量的
		String[] nums = null;
		for (int i = 1; i < in.size()+1; i++){
			nums = in.get(i-1).split(" ");
			for (int j = 0; j < 201; j++){
				if(j%20 == 0 && j!=0){
					sb.append('\r');
					if(j%200 == 0){
						// 空行
						sb.append('\r');
						sb.append('\n');
						continue;
					}
				}
				// 左上角填入一个形状2
				if(Integer.parseInt(nums[1])>0 && j%410 == 0){
					sb.append(1);
					sb.append(' ');
					sb.append(1);
					sb.append(' ');
					sb.append(1);
					sb.append(' ');
					sb.append(1);
					sb.append(' ');
					j = j+4;
				}
				sb.append(0);
				sb.append(' ');
			}
			// 填入
		}
// 		宽度：宽38 换行3 41倍数（倍数<10） 41倍数-3（倍数<10）
//		sb.setCharAt(0,'1');
//		sb.setCharAt(38,'1');
//		sb.setCharAt(41,'1');
//		sb.setCharAt(79,'1');
//		sb.setCharAt(82,'1');
//		sb.setCharAt(120,'1');
//		sb.setCharAt(123,'1');
//		sb.setCharAt(161,'1');
//		sb.setCharAt(164,'1');
//		sb.setCharAt(202,'1');
//		sb.setCharAt(205,'1');
//		道路：竖：41倍数+24（倍数<10）横：2倍数+205（倍数<20）
//		sb.setCharAt(24,'1');
//		sb.setCharAt(65,'1');
//		sb.setCharAt(106,'1');
//		sb.setCharAt(147,'1');
//		sb.setCharAt(188,'1');
//		sb.setCharAt(205,'1');
//		sb.setCharAt(207,'1');
//		sb.setCharAt(209,'1');
//		sb.setCharAt(211,'1');
//		sb.setCharAt(213,'1');
//		sb.setCharAt(215,'1');
//		sb.setCharAt(217,'1');
//		sb.setCharAt(219,'1');
//		sb.setCharAt(221,'1');
//		sb.setCharAt(223,'1');
//		sb.setCharAt(225,'1');
//		sb.setCharAt(227,'1');
//		sb.setCharAt(229,'1');
//		sb.setCharAt(231,'1');
//		sb.setCharAt(233,'1');
//		sb.setCharAt(235,'1');
//		sb.setCharAt(237,'1');
//		sb.setCharAt(239,'1');
//		sb.setCharAt(241,'1');
//		sb.setCharAt(243,'1');
//		sb.setCharAt(270,'1');
//		sb.setCharAt(311,'1');
//		sb.setCharAt(352,'1');
//		sb.setCharAt(393,'1');
		// 写流
		toFile(sb.toString(), "/projects/result.txt");
				//"/Users/mac/DevCloudDemo/src/result.txt");
	}

	/**
	 * 输入
	 */
	public static ArrayList<String> fromFile(){
		ArrayList<String> arrayList = new ArrayList<>();
		try {
			InputStream is = new FileInputStream(new File("/projects/test_case.txt"));
					//"/Users/mac/DevCloudDemo/src/test_case.txt"));
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String line = null;
			while ((line = br.readLine()) != null){
				arrayList.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	/**
	 * 输出
	 * @param src
	 * @param filePath
	 */
	public static void toFile(String src, String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			Writer out = new OutputStreamWriter(fos,"UTF-8");
			out.write(src);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
