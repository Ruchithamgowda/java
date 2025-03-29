class MirrorRunner{

public static void main(String[] args)
{
Mirror mirror=new Mirror("philips","wall","glass","oval","black",50,40,5,2,2000,2,90,80,82,3,2,101,201,301,5);

mirror.display();

Mirror mirror1=new Mirror("Sumsung","table","acrylic","rectangle","white",60,45,6,3,2500,3,85,75,80,4,3,102,202,302,6);

mirror1.display();

Mirror mirror2=new Mirror("Century","handheld","plastic","round","silver",20,15,2,1,500,1,80,70,75,2,1,103,203,303,4);

mirror2.display();
}

}