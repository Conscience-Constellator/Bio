package CC.Encycloped.Abs.Org.Bulk.Bio;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Bulk.Bio.Gen.Genome;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Util.Conect.Nod.Tre_Nod;

public class Bio_Com extends Phys_Com
{
	public static final Clas_Rap Class=Init_StRt(Bio_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Bio_Com(Genome Genome){this.Genome=Genome;}

	public Genome Genome;

	public void Ad_Branch(Tre_Nod Branch){}
	public void Rem_Branch(Tre_Nod Branch){}

	@Override
	public String Get_Phys_Nam(){return "Bio";}

	static{Init_Nd(Bio_Com.class);}
}