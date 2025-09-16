export default async function Home() {
  try {
    const res = await fetch(process.env.API_URL!, { cache: "no-store" });
    if (!res.ok) throw new Error(`API error: ${res.status}`);
    const message = await res.json();
    return <div>{message.message ?? "no api"}</div>;
  } catch (e) {
    console.error(e);
    return <div>APIエラー</div>;
  }
}
