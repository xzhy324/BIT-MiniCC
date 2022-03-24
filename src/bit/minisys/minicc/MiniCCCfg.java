package bit.minisys.minicc;

import bit.minisys.minicc.icgen.internal.IRBuilder;

public class MiniCCCfg {
	// input and output for MiniCCPreProcessor
	public static String MINICC_PP_INPUT_EXT = ".c";//C源程�?
	public static String MINICC_PP_OUTPUT_EXT = ".pp.c";//删除无用注释和空格，宏替换与文件包含
	// input and output for MiniCCScanner
	public static String MINICC_SCANNER_INPUT_EXT = ".pp.c";//预处理过的C程序
	public static String MINICC_SCANNER_OUTPUT_EXT = ".tokens";//词法分析，生成属性字符流
	// input and output for MiniCCParser
	public static String MINICC_PARSER_INPUT_EXT = ".tokens";//词法分析后的属�?�字符流
	public static String MINICC_PARSER_OUTPUT_EXT = ".ast.json";//语法分析，生成语法树
	// input and output for MiniCCSemantic
	public static String MINICC_SEMANTIC_INPUT_EXT = ".tree";//语法�?
	public static String MINICC_SEMANTIC_OUTPUT_EXT = ".tree2.xml";//语义�?�?
	// input and output for MiniCCICGen
	public static String MINICC_ICGEN_INPUT_EXT = ".tree2.xml";//语法�?
	public static String MINICC_ICGEN_OUTPUT_EXT = ".ic.txt";//生成四元式列�?
	// input and output for MiniCCOpt
	public static String MINICC_OPT_INPUT_EXT = ".ic.xml";//中间代码
	public static String MINICC_OPT_OUTPUT_EXT = ".ic2.xml";//实施常量合并等代码优�?
	// input and output for MiniCCCodeGen
	public static String MINICC_CODEGEN_INPUT_EXT = ".ic2.xml";//中间代码
	public static String MINICC_CODEGEN_OUTPUT_EXT = ".code.s";//生成x86或�?�MIPS汇编代码
	// input and output for simulator
	public static String MINICC_ASSEMBLER_INPUT_EXT = ".code.s";//目标代码
	
	//structure for config.xml
	public String type;
	public String path;
	public String skip;
	public String target;
	public String ra;
	public String headless;
}
