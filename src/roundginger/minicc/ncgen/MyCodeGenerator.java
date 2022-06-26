package roundginger.minicc.ncgen;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.ncgen.IMiniCCCodeGen;

public class MyCodeGenerator implements IMiniCCCodeGen {
    public String run(String iFile, MiniCCCfg cfg) throws Exception {
        System.out.println("In NCgen...");
        String oFile = MiniCCUtil.remove2Ext(iFile) + MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT;

        if(cfg.target.equals("mips")) {
            //TODO:
        }else if (cfg.target.equals("riscv")) {
            //TODO:
        }else if (cfg.target.equals("x86")){
            System.out.println("target:x86");
        }

        System.out.println("7. RR's Target code generation finished!");

        return oFile;
    }
}
