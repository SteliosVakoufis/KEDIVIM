var arr1=[-3,8,7,6,5,-4,3,2,1];
var arr2=[];
var min=arr1[0];
var pos;
var max=arr1[0];

console.log("1>", max);
for (i=0; i<arr1.length; i++)
{
    console.log("2>", max, arr1[i]);
    if (max<arr1[i]) 
    {
        max=arr1[i];
        console.log("3>",max);
    }
}

for (var i=0;i<arr1.length;i++)
{
	for (var j=0;j<arr1.length;j++)
	{
		if (arr1[j]!="x")
		{
            console.log("4>", min, arr1[j]);
            if (min>arr1[j]) 
			{
				min=arr1[j];
				pos=j;
                console.log("5>", min, pos);
			}
		}
	}
	arr2[i]=min;
	arr1[pos]="x";
	min=max;
    console.log("6>", arr2, arr1);
}
console.log(arr2);