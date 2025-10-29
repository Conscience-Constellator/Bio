package CC.Bulk.Bio.Gen;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Object_Plus;
import java.util.ArrayList;

public class Genome extends Object_Plus implements Gen_Prt
{
	public static final Clas_Rap Class=Init_StRt(Genome.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public ArrayList<Gene> Gen_List=new ArrayList<>();

	public Genome(Gene[] List){for(Gene Gen:List){this.Gen_List.add(Gen);}}

	static{Init_Nd(Genome.class);}
}